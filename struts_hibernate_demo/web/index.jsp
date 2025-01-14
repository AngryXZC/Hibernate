<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <meta charset="utf-8"/>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<div class="dvhead">
    <div class="dvlogo"><a href="index.html">你问我答</a></div>
    <div class="dvsearch">10秒钟注册账号，找到你的同学</div>

    <s:if test="#user!=null">
        <div class="dvreg">
            欢迎<s:property  value="#user.username"/>
        </div>
    </s:if>
    <s:else>
        <div class="dvreg">
            暂无账号，立即&nbsp;<a href="register.jsp"> 注册</a>
        </div>
    </s:else>
</div>
<div class="dvContent">

    <div class="dvquesleft">

        <div class="dvqstitle">
            <image class="imgbean" src="images/bean.jpg">
                <span class="qsTitle">问答</span>
                <span class="back"><ab href="">《《返回上一页</a></span>
        </div>
        <div class="dvtabhead">
            <div class="tabheads tabcurrent">全部问题</div>
            <div class="tabheads">我的问题</div>
            <div class="tabheads">关注问题</div>
            <div class="tabheads">问题标签</div>
        </div>
        <div class="tabContent">
            <div class="dvtags">
                <a class="curenttag">待解决</a><span class="line"></span><a>高分</a><span
                    class="line"></span><a>新回答</a><span class="line"></span><a>已解决</a>
            </div>
            <div class="tab">
                <s:iterator value="pasteList" var="paste">
                    <div class="dvques">
                        <div class="quesCount">
                            <div class="count"><s:property value="ansnum"/></div>
                            <div class="ques">回答数</div>
                        </div>
                        <div class="quesContent">
                            <div class="quesTitle">
                                <s:property value="offer"/>
                                <image src="images/bean.jpg" class="bean"> <span
                                        class="spanques"><s:property value="#paste.title"/> </span>
                            </div>
                            <div class="qContent">
                                <s:property value="content"/>
                            </div>
                            <div class="tags">
                                <span class="tag">excel</span><span class="tag">程序</span>
                            </div>
                            <div class="quesUser">
                                <image src="images/0.gif" class="imguser"/>
                                <div class="userName">
                                    <s:if test="ansnum%2==0"> 张大值</s:if>
                                    <s:else>xzc</s:else>
                                    <div class="liulan">浏览(9) 30分钟前</div>
                                </div>

                            </div>
                        </div>

                    </div>

                </s:iterator>
            </div>
            <div class="tab hidden">2</div>
            <div class="tab hidden">3</div>
            <div class="tab hidden">4</div>
        </div>
    </div>

    <div class="dvquesright">
        <div>
            <buton class="btnques" onclick="location.href='add.html'">提个问题</buton>
        </div>
        <div class="dvorder">
            <div class="orderTitle">专家排行榜</div>
            <div class="users">
                <image class="userface" src="images/0.gif"/>
                <div class="dvuser">
                    <div class="userTitle">陈有龙</div>
                    <div class="userdeital">大牛6级 豆:14006</div>
                </div>
            </div>
            <div class="users">
                <image class="userface" src="images/1.gif"/>
                <div class="dvuser">
                    <div class="userTitle">陈有龙</div>
                    <div class="userdeital">大牛6级 豆:14006</div>
                </div>
            </div>
            <div class="users">
                <image class="userface" src="images/2.gif"/>
                <div class="dvuser">
                    <div class="userTitle">陈有龙</div>
                    <div class="userdeital">大牛6级 豆:14006</div>
                </div>
            </div>
            <div class="users">
                <image class="userface" src="images/3.gif"/>
                <div class="dvuser">
                    <div class="userTitle">陈有龙</div>
                    <div class="userdeital">大牛6级 豆:14006</div>
                </div>
            </div>
            <div class="users">
                <image class="userface" src="images/4.gif"/>
                <div class="dvuser">
                    <div class="userTitle">陈有龙</div>
                    <div class="userdeital">大牛6级 豆:14006</div>
                </div>
            </div>
            <div class="users">
                <image class="userface" src="images/5.gif"/>
                <div class="dvuser">
                    <div class="userTitle">陈有龙</div>
                    <div class="userdeital">大牛6级 豆:14006</div>
                </div>
            </div>
            <div class="users">
                <image class="userface" src="images/6.gif"/>
                <div class="dvuser">
                    <div class="userTitle">陈有龙</div>
                    <div class="userdeital">大牛6级 豆:14006</div>
                </div>
            </div>


        </div>

    </div>

</div>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    $(function () {

        $(".tabheads").click(function () {
            $(".tabheads").removeClass("tabcurrent").eq($(this).index()).addClass("tabcurrent");
            $(".tab").hide().eq($(this).index()).show();
        });
    });
</script>
<body>
</body>
</html>


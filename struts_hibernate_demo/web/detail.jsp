<%--
  Created by IntelliJ IDEA.
  User: xzc
  Date: 2024/10/22
  Time: 08:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"  %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>问题详情</title>
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="keywords" content="fly,layui,前端社区">
    <meta name="description"
          content="">
    <link rel="stylesheet" href="res/layui/css/layui.css">
    <link rel="stylesheet" href="res/css/global.css">
    <script src="res/layui/layui.js"></script>
    <script src="js/jquery.js"></script>
    <style type="text/css" rel="stylesheet">
        form {
            margin: 0;
        }

        .editor {
            margin-top: 5px;
            margin-bottom: 5px;
        }
    </style>

</head>
<body>
<iframe src="head.html" scrolling="no" width="100%" height="65px"></iframe>
<div class="main layui-clear">
    <div class="wrap">
        <div class="content detail">
            <div class="fly-panel detail-box">
                <h1>帖子标题</h1>
                <div class="fly-tip fly-detail-hint" data-id="">
                    <span class="fly-tip-stick">置顶帖</span><span class="jie-admin"> <a
                        href="">点击置顶</a> </span> <span
                        class="layui-btn layui-btn-mini jie-admin"> <a href="">取消置顶</a>
						</span> <span class="jie-admin" type="del" style="margin-left: 20px;">
							<a>删除该帖</a> </span>
                    </span>
                    <div class="fly-list-hint">
                        <i class="iconfont" title="回答">&#xe60c;</i> 2
                    </div>
                </div>
                <div class="detail-about">
                    <a class="jie-user" href=""> <img
                            src="res/images/uer.jpg" alt="头像"> <cite> 压缩
                        <em>2017-05-01发布</em> </cite> </a>
                    <div class="detail-hits" data-id="{{rows.id}}">
							 <span class="layui-btn layui-btn-mini jie-admin"><a
                                     href="#">已完帖，无法编辑</a> </span> <span
                            class="layui-btn layui-btn-mini jie-admin" type="collect"
                            data-type="add"> <a id="collectPost">收藏</a> </span> <span
                            class="layui-btn layui-btn-mini jie-admin  layui-btn-danger"
                            type="collect" data-type="add"> <a>取消收藏</a> </span>

                    </div>
                </div>
                <div class="detail-body photos" style="margin-bottom: 20px;">
                    <p>帖子内容</p>
                </div>
            </div>
            <div class="fly-panel detail-box" style="padding-top: 0;">
                <a name="comment"></a>
                <ul class="jieda photos" id="jieda">
                    <li data-id="12" class="jieda-daan"><a
                            name="item-121212121212"></a>
                        <div class="detail-about detail-about-reply">
                            <a class="jie-user" href=""> <img
                                    src="res/images/uer.jpg" alt=""> <cite> <i>纸飞机</i>
                                <!-- <em>(楼主)</em>
          <em style="color:#5FB878">(管理员)</em> --> </cite> </a>
                            <div class="detail-hits">
                                <span>3分钟前</span>
                            </div>
                            <i class="iconfont icon-caina" title="最佳答案"></i>
                        </div>
                        <div class="detail-body jieda-body">
                            <p>么么哒</p>
                        </div>
                        <div class="jieda-reply">
								<span class="jieda-zan zanok" type="zan"><i
                                        class="iconfont icon-zan"></i><em>12</em>
								</span>
                            <!-- <div class="jieda-admin">
            <span type="del">删除</span>
            <span class="jieda-accept" type="accept">采纳</span>
          </div> -->
                        </div>
                    </li>
                    <li data-id="13"><a name="item-121212121212"></a>
                        <div class="detail-about detail-about-reply">
                            <a class="jie-user" href=""> <img
                                    src="res/images/uer.jpg" alt=""> <cite> <i>香菇</i>
                                <em style="color:#FF9E3F">活雷锋</em> </cite> </a>
                            <div class="detail-hits">
                                <span>刚刚</span>
                            </div>
                        </div>
                        <div class="detail-body jieda-body">
                            <p>蓝瘦</p>
                        </div>
                        <div class="jieda-reply">
								<span class="jieda-zan" type="zan"><i
                                        class="iconfont icon-zan"></i><em>0</em>
								</span>
                            <div class="jieda-admin">
                                <span type="del"><a href="#" class="layui-btn layui-btn-danger layui-btn-small">删除</a></span>
                                <span class="jieda-accept" type="accept">
									<a href="#" class="layui-btn  layui-btn-small">采纳</a></span>
                            </div>
                        </div>
                    </li>

                    <!-- <li class="fly-none">没有任何回答</li> -->
                </ul>
                <span
                        id="toName">@ 压缩(楼主)</span>
                <div class="layui-form layui-form-pane">
                    <form action="${pageContext.request.contextPath}/AnswerAction_addAnswer">
                        <input type="hidden" name="pasteid" value="402885c9929cc63301929cc6b1120000">
                        <div class="layui-form-item layui-form-text">
                            <div class="layui-input-block">
                                <div class="editor">
                            <textarea id="content" name="content"
                                      style="width:690px;height:450px;visibility:hidden;"></textarea>
                                </div>
                            </div>
                        <div class="layui-form-item">
                            <button class="layui-btn" lay-filter="*" lay-submit>提交回答</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <div class="edge">
        <dl class="fly-panel fly-list-one">
            <dt class="fly-panel-title">最近热帖</dt>
            <dd>
                <a href="">使用 layui 秒搭后台大布局（基本结构）</a> <span><i
                    class="iconfont">&#xe60b;</i> 6087</span>
            </dd>
            <dd>
                <a href="">Java实现LayIM后端的核心代码</a> <span><i class="iconfont">&#xe60b;</i>
						767</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局（基本结构）</a> <span><i
                    class="iconfont">&#xe60b;</i> 6087</span>
            </dd>
            <dd>
                <a href="">Java实现LayIM后端的核心代码</a> <span><i class="iconfont">&#xe60b;</i>
						767</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局（基本结构）</a> <span><i
                    class="iconfont">&#xe60b;</i> 6087</span>
            </dd>
            <dd>
                <a href="">Java实现LayIM后端的核心代码</a> <span><i class="iconfont">&#xe60b;</i>
						767</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局（基本结构）</a> <span><i
                    class="iconfont">&#xe60b;</i> 6087</span>
            </dd>
            <dd>
                <a href="">Java实现LayIM后端的核心代码</a> <span><i class="iconfont">&#xe60b;</i>
						767</span>
            </dd>
        </dl>

        <dl class="fly-panel fly-list-one">
            <dt class="fly-panel-title">近期热议</dt>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a> <span><i
                    class="iconfont">&#xe60c;</i> 96</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a> <span><i
                    class="iconfont">&#xe60c;</i> 96</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a> <span><i
                    class="iconfont">&#xe60c;</i> 96</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a> <span><i
                    class="iconfont">&#xe60c;</i> 96</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a> <span><i
                    class="iconfont">&#xe60c;</i> 96</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a> <span><i
                    class="iconfont">&#xe60c;</i> 96</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a> <span><i
                    class="iconfont">&#xe60c;</i> 96</span>
            </dd>
            <dd>
                <a href="">使用 layui 秒搭后台大布局之基本结构</a> <span><i
                    class="iconfont">&#xe60c;</i> 96</span>
            </dd>
        </dl>
    </div>
</div>

<script type="text/javascript" charset="utf-8" src="js/kindeditor.js"></script>
<script type="text/javascript">
    KE.show({
        id: 'content',
        resizeMode: 1,
        cssPath: './index.css',
        items: [
            'fontname', 'fontsize', 'textcolor', 'bgcolor', 'bold', 'italic', 'underline',
            'removeformat', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
            'insertunorderedlist', 'emoticons', 'image', 'link']
    });
</script>
<script>

    layui.cache.page = '';
    layui.cache.user = {
        username: '游客'
        , uid: -1
        , avatar: '../res/images/avatar/00.jpg'
        , experience: 83
        , sex: '男'
    };
    layui.config({
        version: "2.0.0"
        , base: '../res/mods/'
    }).extend({
        fly: 'index'
    }).use('fly');
</script>
</body>
</html>

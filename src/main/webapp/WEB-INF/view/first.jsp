
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>估价宝后台管理首页</title>
    <script src="/static/jquery/jquery.min.js" type="text/javascript"></script>
    <link href="/static/jquery/themes/icon.css" rel="stylesheet" type="text/css"/>
    <link href="/static/jquery/themes/color.css" rel="stylesheet" type="text/css"/>
    <link href="/static/jquery/themes/default/easyui.css" rel="stylesheet" type="text/css"/>
    <link href="/static/css/index.css" rel="stylesheet" type="text/css"/>
    <script src="/static/jquery/jquery.easyui.min.js" type="text/javascript"></script>
    <script src="/static/jquery/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {


            $(".js-menu-item").click(function (event) {
                event.preventDefault();
                $(".js-menu-item").removeClass("active");
                $(this).addClass("active");
                var url = $(this).attr('href');
                var title = $(this).text();
                addTab(url, title);

            })
//            console.log($(".planet-menu-item.js-menu-item:nth-child(1)"));
            $(".planet-menu-item.js-menu-item:nth-child(1)").trigger("click");
        });


        function addTab(url, title) {


            $('#tt').tabs("close", title);
            // add a new tab panel
            $('#tt').tabs('add', {
                title: title,
                content: "<iframe src='" + url + "' style='width:100%;height:100%;border:0'></iframe>",
                closable: true
            });
        }

    </script>
</head>
<body>

<div id="cc" class="easyui-layout" style="width:100%;height:100%;">
    <div class="js-menu-list" data-options="region:'west',title:'管理员:   ${name}',split:true"
         style="width:300px;overflow: hidden;">
        <div id="aa" class="easyui-accordion" style="width:100%;height:100%;">
            <div title="管理列表" data-options="iconCls:'icon-reload'" class="planet-menu">

                <c:forEach items="${sysmenuList}" var="sysmenu">
                    <a href="/operator/list" class="planet-menu-item js-menu-item">${sysmenu.name}</a>

                </c:forEach>
                <%--<a href="/user/index" class="planet-menu-item js-menu-item">用户信息</a>--%>
                <%--<a href="/feedback/index" class="planet-menu-item js-menu-item">用户反馈</a>--%>
                <%--<a href="/project/index" class="planet-menu-item js-menu-item">项目信息</a>--%>
                <%--<a href="/category/index" class="planet-menu-item js-menu-item">分类信息</a>--%>
                <%--<a href="/function/index" class="planet-menu-item js-menu-item">功能模块</a>--%>
                <%--<a href="/template/index" class="planet-menu-item js-menu-item">模板信息</a>--%>
                <%--<a href="/analyse/index" class="planet-menu-item js-menu-item">使用分析</a>--%>
                <%--<a href="/admin/index" class="planet-menu-item js-menu-item">管理员管理</a>--%>

            </div>
        </div>

    </div>
    <button class="button" style="z-index: 998;position: absolute; right: 2px;top: 1px;" ><a href="/login/logout">退出登录</a></button>
    <div data-options="region:'center',split:true" style="padding:0px;background:#eee;">
        <div id="tt" class="easyui-tabs" style="width:100%;height:100%;" border=0>

        </div>

    </div>
</div>
</body>
</html>

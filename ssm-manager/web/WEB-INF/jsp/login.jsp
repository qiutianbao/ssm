<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-28
  Time: 下午5:25
  登录
--%>
<%@ include file="/WEB-INF/jsp/include/includes.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%@ page contentType="text/html;charset=UTF-8"%>
    <title>吉祥天宝数据中心管理平台</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="<%=basePath%>/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<%=basePath%>/css/font-awesome-4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="<%=basePath%>/css/ionicons-2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=basePath%>/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="<%=basePath%>/plugins/iCheck/square/blue.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="index.jsp">吉祥天宝数据管理平台</a>
    </div><!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">用户登录</p>
        <form action="login" method="post" id="loginForm">
            <input type="hidden" name="action" value="do" />
            <div class="form-group has-feedback">
                <input type="text" class="form-control" name="loginname" id="loginname" placeholder="用户名" required>
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
                <span id="span_loginname"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" name="password" id="password" placeholder="密码"  required>
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                <span id="span_password"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="checkbox"> 记住密码
                        </label>
                    </div>
                </div><!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div><!-- /.col -->
            </div>
        </form>

    </div><!-- /.login-box-body -->
</div><!-- /.login-box -->

<!-- jQuery 2.1.4 -->
<script src="<%=basePath%>/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<!-- Bootstrap 3.3.5 -->
<script src="<%=basePath%>/bootstrap/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="<%=basePath%>/plugins/iCheck/icheck.min.js"></script>
<script>

    $(function () {

        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });

        var errMsg = "${errMsg}";
        if(errMsg != null && errMsg.length > 0){
            alert(errMsg);
        }

    });

</script>
</body>
</html>
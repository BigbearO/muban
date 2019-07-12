<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>	
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">
</head>
<body>
  <div class="container-fluid">
		<div class="row">
		   ${msg }
			<div class="col-md-12">
				<form role="form"  action="Register" method="post">

					<div class="form-group row">
						<label for="inputName" class="col-sm-2 col-form-label">用户名:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputName"
								placeholder="用户名" name="name" ">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputPass" class="col-sm-2 col-form-label">密码:</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="inputPass"
								placeholder="密码" name="pass">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputPass" class="col-sm-2 col-form-label">地址：</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="address""
								placeholder="地址" name="address">
						</div>
					</div>
					<div class="form-group row">
						<label for="inputPass" class="col-sm-2 col-form-label">手机</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="phone""
								placeholder="phone" name="phone"">
						</div>
					</div>

					<div class="form-group row">
						<div class="col-sm-10">
							<button type="submit" class="btn btn-primary">注册</button>
						</div>
					</div>
				</form>

			</div>
		</div>
	</div>
	
	<div>已经注册，去<a href="toLogin">登录</a></div>
	<!-- 上面那个不行就用这个href="javascript:window.location.href='login.jsp'" -->
	
	
	
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/jquery/jquery-3.3.1.slim.min.js"></script>
	<script src="static/popper/popper.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
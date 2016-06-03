<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="zh">
<head>
<title>尼玛的主页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/common-word.css">
</head>
<body>
	<jsp:include page="competition/common/common.jsp" />
	<jsp:include page="competition/common/top.jsp" />

	<div class="container">
		<div class="row home-welcome-line">
			<div class="col-md-12 home-welcome">
				<span>${sessionScope.user.username}，欢迎您！</span>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4 col-sm-4 col-xs-12 function-box">
				<div class="function-box-body well">
					<h2>器材</h2>
					<p>
						<img src="image/icon/instrument.png" /> <span> 体育馆器材的查询，租借预约等 </span>
					</p>
					<button class="btn btn-primary">
						<span>进入</span><span class="glyphicon glyphicon-triangle-right"></span>
					</button>
					<div class="clear"></div>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12 function-box">
				<div class="function-box-body well">
					<h2>赛事</h2>
					<p>
						<img src="image/icon/instrument.png" /> <span> 这里是说明文字 </span>
					</p>
					<button class="btn btn-primary">
						<span>进入</span><span class="glyphicon glyphicon-triangle-right"></span>
					</button>
					<div class="clear"></div>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12 function-box">
				<div class="function-box-body well">
					<h2>器材</h2>
					<p>
						<img src="image/icon/instrument.png" /> <span> 这里是说明文字 </span>
					</p>
					<button class="btn btn-primary">
						<span>进入</span><span class="glyphicon glyphicon-triangle-right"></span>
					</button>
					<div class="clear"></div>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12 function-box">
				<div class="function-box-body well">
					<h2>器材</h2>
					<p>
						<img src="image/icon/instrument.png" /> <span> 这里是说明文字 </span>
					</p>
					<button class="btn btn-primary">
						<span>进入</span><span class="glyphicon glyphicon-triangle-right"></span>
					</button>
					<div class="clear"></div>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12 function-box">
				<div class="function-box-body well">
					<h2>器材</h2>
					<p>
						<img src="image/icon/instrument.png" /> <span> 这里是说明文字 </span>
					</p>
					<button class="btn btn-primary">
						<span>进入</span><span class="glyphicon glyphicon-triangle-right"></span>
					</button>
					<div class="clear"></div>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12 function-box">
				<div class="function-box-body well">
					<h2>器材</h2>
					<p>
						<img src="image/icon/instrument.png" /> <span> 这里是说明文字 </span>
					</p>
					<button class="btn btn-primary">
						<span>进入</span><span class="glyphicon glyphicon-triangle-right"></span>
					</button>
					<div class="clear"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
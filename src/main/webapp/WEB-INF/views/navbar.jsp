<!DOCTYPE HTML>
<html lang="pl">
<head>
	<meta charset="utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Przepisy.pl</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
	<link href="https://fonts.googleapis.com/css?family=Signika&display=swap" rel="stylesheet">
</head>
<style>
nav .nav-item li a{
  color: black !important;
}
</style>
<body>
	<div class="container-fluid" style="font-family: 'Signika', sans-serif">
	    <div class="row text-center py-2">
			<div class="col-lg-12">
				<a class="text-dark" href="#"><h3>Przepisy.pl</h3></a>
				<hr style="width: 80%; height: 4px;">
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
					<ul class="nav justify-content-center text-dark">
						<li class="nav-item">
							<a class="nav-link" href="<%=request.getContextPath()%>/hello"><i class="fas fa-home" aria-hidden="true"></i> Glowna </a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="<%=request.getContextPath()%>/recipe/list"><i class="fa fa-shopping-basket" aria-hidden="true"></i> Lista przepisow </a>
						</li>
						<li class="nav-item">
							<a class="nav-link" href="<%=request.getContextPath()%>/login"><i class="fas fa-map" aria-hidden="true"></i> Zaloguj sie </a>
						</li>
					</ul>
				<hr style="width: 80%; height: 4px;">
			</div>
		</div>
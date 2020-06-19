<%@include file="/WEB-INF/views/navbar.jsp"%>
			<div class="row p-5 text-center">
				<div class="col-lg-12">
					<h3>Zarejestruj sie</h3>
					<hr style="width: 20%; height: 4px;">
					<div class="card text-center">
						<div class="card-body">
							<form action="<%=request.getContextPath()%>/register">
								<label for="Login">Login:</label>
    							<input class="form-control" id="Login">
    							
    							<label for="Password">Haslo:</label>
    							<input class="form-control" type="password" id="Password">
    							
    							<button type="submit" class="btn btn-primary">Zarejestruj</button>
							</form>
						</div>
					</div>
				</div>
			</div>
    </body>
</html>

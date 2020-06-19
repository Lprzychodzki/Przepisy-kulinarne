<%@include file="/WEB-INF/views/navbar.jsp"%>
			<div class="row p-5 text-center">
				<div class="col-lg-12">
					<h3>Dodaj nowy przepis</h3>
					<hr style="width: 20%; height: 4px;">
					<div class="card text-center">
						<div class="card-body">
							<form action="<%=request.getContextPath()%>/recipe/add">
								<label for="nazwa">Nazwa:</label>
    							<input class="form-control" id="nazwa">
    							
    							<label for="typ">Typ:</label>
    							<input class="form-control" id="typ">
    							
    							<label for="trudnosc">Trudnosc Wykonania:</label>
    							<input class="form-control" id="trudnosc">
    							
    							<label for="skladniki">Skladniki:</label>
    							<input class="form-control" id="skladniki">
    							
    							<label for="czas">Czas Wykonania:</label>
    							<input class="form-control" id="skladniki">
    							
    							<label for="opis">Opis:</label>
    							<input class="form-control" id="opis">
    							<br>
    							<button type="submit" class="btn btn-primary">Dodaj</button>
							</form>
						</div>
					</div>
				</div>
			</div>
    </body>
</html>

<%@include file="/WEB-INF/views/navbar.jsp"%>
			<div class="row p-5 text-center">
			<div class="col-lg-9">
				<h3>Przepisy</h3>
				<hr style="width: 20%; height: 4px;">
				<div class="card text-center">
					<div class="card-body">
							<ul class="list-group">
							<c:forEach var="recipelist" items="${listrecipe}">
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p>${listrecipe.name}</p>
								</li>
							</c:forEach>	
							</ul>
					</div>
				</div>
			</div>
			<div class="col-lg-3">
				<h3>Filtruj:</h3>
				<hr style="width: 20%; height: 4px;">
				<div class="card text-center">
					<div class="card-body">
							<h5 class="p-3">Rodzaj potrawy:</h5>
							<ul class="list-group">
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/przystawka">Przystawka</p>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/sniadanie">Sniadanie</p>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/deser">Deser</p>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/obiad">Obiad</p>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/kolacja">Kolacja</p>
								</li>
							</ul>
							<h5 class="p-3">Trudnosc wykonania:</h5>
							<ul class="list-group">
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/latwe">latwe</p>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/srednie">Srednie</p>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/trudne">Trudne</p>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
									<p href="<%=request.getContextPath()%>/recipe/sort/btrudne">Bardzo trudne</p>
								</li>
							</ul>
					</div>
				</div>
			</div>
		</div>
    </body>
</html>

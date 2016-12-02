<%@ include file="common/header.jspf"%>


<div class="container">
	<h1>Register</h1>

	<form:form name="myForm" method="post" commandName="user">
		<form:hidden path="id"/>

		<fieldset class="form-group">
			<form:label path="username" class="col-md-1 control-label">User Name: </form:label>
			<div class="col-md-5">
				<form:input path="username" class="form-control" type="text" name="username" placeholder="Enter username" id="username"></form:input>
			</div>
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="password" class="col-md-1 control-label">Passward: </form:label>
			<div class="col-md-5">
				<form:input path="password" class="form-control" type="password" name="password" placeholder="Enter password" id="password"></form:input>
				<form:errors path="password" cssClass="text-warning" />
			</div>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="role" class="col-md-1 control-label">role: </form:label>
			<div class="col-md-5">
				<form:input path="role" class="form-control" type="text" name="role" placeholder="Enter role" id="role"></form:input>
				<form:errors path="role" cssClass="text-warning" />
			</div>
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="department" class="col-md-1 control-label">department: </form:label>
			<div class="col-md-5">
				<form:input path="department" class="form-control" type="text" name="department" placeholder="Enter department" id="department"></form:input>
				<form:errors path="department" cssClass="text-warning" />
			</div>
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="year" class="col-md-1 control-label">year: </form:label>
			<div class="col-md-5">
				<form:input path="year" class="form-control" type="text" name="year" placeholder="Enter year" id="year"></form:input>
				<form:errors path="year" cssClass="text-warning" />
			</div>
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="phone" class="col-md-1 control-label"> phone: </form:label>
			<div class="col-md-5">
				<form:input path="phone" class="form-control" type="text" name="phone" placeholder="Enter phone" id="phone"></form:input>
				<form:errors path="phone" cssClass="text-warning" />
			</div>
		</fieldset>
		
		
		

		<input class="btn btn-success" type="submit" value="Register" />
	</form:form>

</div>

<%@ include file="common/footer.jspf"%>



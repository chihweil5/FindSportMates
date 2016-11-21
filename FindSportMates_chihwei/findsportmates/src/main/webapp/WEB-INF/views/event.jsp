<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<div class="container">
	<h1>Add a Event</h1>

	<form:form method="post" commandName="event">
		<form:hidden path="eventId" />

		<fieldset class="form-group">
			<form:label path="eventType" class="col-md-1 control-label">Sport: </form:label>
			<div class="col-md-5">
				<form:select path="eventType" class="form-control" id="type"
					required="required">
					<option value="NONE" label="--- Select ---" />
					<option>Basketball</option>
					<option>Volleyball</option>
				</form:select>
				<form:errors path="eventType" cssClass="text-warning" />
			</div>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="eventDate" class="col-md-1 control-label">Date: </form:label>
			<div class="col-md-5">
				<div class="input-group date" data-provide="datepicker">
					<input type="text" class="form-control">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
			</div>
			<!--  jQuery -->
			<script type="text/javascript"
				src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

			<!-- Isolated Version of Bootstrap, not needed if your site already uses Bootstrap -->
			<link rel="stylesheet" href="https://formden.com/static/cdn/bootstrap-iso.css" />

			<!-- Bootstrap Date-Picker Plugin -->
			<script type="text/javascript"
				src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
			<link rel="stylesheet"
				href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />
			<script>
				$(function() {
					$("#datepicker").datepicker();
				});
			</script>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="eventTime" class="col-md-1 control-label">Time: </form:label>
			<div class="col-md-5">
				<form:select path="eventTime" class="form-control" id="time"
					required="required">
					<option value="NONE" label="--- Select ---" />
					<option>08:00-10:00</option>
					<option>10:00-12:00</option>
					<option>13:00-15:00</option>
					<option>15:00-17:00</option>
				</form:select>
				<form:errors path="eventTime" cssClass="text-warning" />
			</div>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="eventPlace" class="col-md-1 control-label">Place: </form:label>
			<div class="col-md-5">
				<form:select path="eventPlace" class="form-control" id="place"
					required="required">
					<option value="NONE" label="--- Select ---" />
					<option>court1</option>
					<option>court2</option>
					<option>court3</option>
				</form:select>
				<form:errors path="eventPlace" cssClass="text-warning" />
			</div>
		</fieldset>
		<input class="btn btn-success" type="submit" value="Submit" />
	</form:form>

</div>

<%@ include file="common/footer.jspf"%>

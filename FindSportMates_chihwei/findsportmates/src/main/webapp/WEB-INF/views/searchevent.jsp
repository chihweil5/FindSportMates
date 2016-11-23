<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<div class="container">
	<h1>Search Events</h1>

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
					<option>Badminton</option>
					<option>Soccer</option>
					<option>Tennis</option>
				</form:select>
				<form:errors path="eventType" cssClass="text-warning" />
			</div>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="eventDate" class="col-md-1 control-label">Date: </form:label>
			<div class="col-md-5">
				<div class="input-group">
					<form:input class="form-control" id="date" name="date"
						placeholder="MM/DD/YYYY" type="text" path="eventDate"/>
					<div class="input-group-addon">
						<i class="fa fa-calendar"> </i>
					</div>
				</div>
			</div>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="eventTime" class="col-md-1 control-label">From Time: </form:label>
			<div class="col-md-5">
				<form:select path="eventTime" class="form-control" id="time1"
					required="required">
					<option value="NONE" label="--- Select ---" />
					<option>08:00</option>
					<option>09:00</option>
					<option>10:00</option>
					<option>11:00</option>
					<option>12:00</option>
					<option>13:00</option>
					<option>14:00</option>
					<option>15:00</option>
					<option>16:00</option>
					<option>17:00</option>
					<option>18:00</option>
					<option>19:00</option>
					<option>20:00</option>
					<option>21:00</option>
					<option>22:00</option>
				</form:select>
				<form:errors path="eventTime" cssClass="text-warning" />
			</div>
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="eventTime" class="col-md-1 control-label">To Time: </form:label>
			<div class="col-md-5">
				<form:select path="eventTime" class="form-control" id="time2"
					required="required">
					<option value="NONE" label="--- Select ---" />
					<option>08:00</option>
					<option>09:00</option>
					<option>10:00</option>
					<option>11:00</option>
					<option>12:00</option>
					<option>13:00</option>
					<option>14:00</option>
					<option>15:00</option>
					<option>16:00</option>
					<option>17:00</option>
					<option>18:00</option>
					<option>19:00</option>
					<option>20:00</option>
					<option>21:00</option>
					<option>22:00</option>
				</form:select>
				<form:errors path="eventTime" cssClass="text-warning" />
			</div>
		</fieldset>

		
		<input class="btn btn-success" type="submit" value="Search" />
	</form:form>

</div>

<%@ include file="common/footer.jspf"%>

<!-- Extra JavaScript/CSS added manually in "Settings" tab -->
<!-- Include jQuery -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

<!-- Include Date Range Picker -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />

<script>
	$(document).ready(
			function() {
				var date_input = $('input[name="eventDate"]'); //our date input has the name "date"
				var container = $('.bootstrap-iso form').length > 0 ? $(
						'.bootstrap-iso form').parent() : "body";
				date_input.datepicker({
					format : 'mm/dd/yyyy',
					container : container,
					orientation: "right top",
					todayHighlight : true,
					autoclose : true
				})
			});
			
</script>

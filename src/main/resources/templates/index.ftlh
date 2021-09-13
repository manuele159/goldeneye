<!DOCTYPE html>  
<html lang="en">  
    <head>
        <meta charset="UTF-8">
        <title>Goldeneye</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    </head>
    <body>
    <div class="container">
   		<h2>Email generator GoldenEye</h2>
  		<p>Please fill the form below:</p>
 		<form action="/register">
 			<div class="form-group">
	    		<label for="name">Name:</label>
	    		<input type="text" class="form-control" name="name" id="name" placeholder="Insert your name here" required>
  			</div>
  			 <div class="form-group">
	    		<label for="surname">Surname:</label>
	    		<input type="text" class="form-control" name="surname" id="surname" placeholder="Insert your surname here" required>
  			</div>
  			<div class="form-group">
	  			<label for="location">Location</label>
				<select class="form-control input-sm" name="location" id="location" required >
				  <option value="milan" selected>Milan</option>
				  <option value="spain">Spain</option>
				  <option value="new york">New York </option>
				</select>
			</div>
				<div class="form-group">
				<label for="department">Department</label>
			    <select class="form-control input-sm" name="department" id="department" required > 
				</select>
			</div>
  			<button type="submit" class="btn btn-primary">Submit</button>
 		</form>
 		<script>
 		$(document).ready(function () {
 		$("input[required], select[required]").attr("oninvalid", "this.setCustomValidity('Please fill this field!')");
		$("input[required], select[required]").attr("oninput", "setCustomValidity('')");
 		$("#department").html("<option value='Design'>Design</option><option value='Business'>Business</option><option value='Advertising'>Advertising</option>");
	    $("#location").change(function () {
	        var val = $(this).val();
	        if (val == "milan") {
	            $("#department").html("<option value='Design'>Design</option><option value='Business'>Business</option><option value='Advertising'>Advertising</option>");
	        } else if (val == "spain") {
	            $("#department").html("<option value='Research & development'>Research & development</option><option value='Business'>Business</option>");
	        } else if (val == "new york") {
	            $("#department").html("<option value='Business'>Business</option><option value='Advertising'>Advertising</option>");
	        } 
	    });
		});
		</script>
 	</div>
    </body>
</html>
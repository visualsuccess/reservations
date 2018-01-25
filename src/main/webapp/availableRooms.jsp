<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="utf-8" />
	<title>Room Reservation</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
	<script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
	<script>

	$(document).ready( function () {
		 var table = $('#roomsTable').DataTable({
				"sAjaxSource": "/availableRooms",
				"sAjaxDataProp": "",
				"order": [[ 0, "asc" ]],
				"aoColumns": [
				    { "mData": "id"},
			      	{ "mData": "Style" },
					{ "mData": "Price_per_night" }
				]
		 })
	});
	
	</script>
</head>

<body>
	<h1>Available Rooms</h1>
	<table id="roomsTable" class="display">
      
       <!-- Header Table -->
       <thead>
            <tr>
                <th>Id</th>
				<th>Room Type</th>
                <th>Price</th>
            </tr>
        </thead>
    </table>
    
</body>
</html>
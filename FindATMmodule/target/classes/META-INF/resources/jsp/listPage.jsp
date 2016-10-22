<!DOCTYPE html>
<html lang="en">
    <head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<title>ATM Finder</title>
        <link href="../FindATMmodule/css/jquery.dataTables.min.css" rel="stylesheet">
	<link href="../FindATMmodule/css/atm-list.css" rel="stylesheet">
        <script src="../FindATMmodule/js/jquery.min.js"></script>
	<script src="../FindATMmodule/js/jquery-ui.min.js"></script>
	<script src="../FindATMmodule/js/jquery.dataTables.min.js"></script>   
        <script src="../FindATMmodule/js/atm-list.js"></script>

    </head>
    <body>
	<div id="header">
	    <div class="container">
                <div class="row">
                    <CENTER>
                        <STYLE>H2 {FONT-SIZE: 21pt; COLOR: #000080}; H3 {FONT-SIZE: 17pt; COLOR: #008000}</STYLE>
                        <H1 align="center"> ATM Finder </H1>
                        <HR WIDTH="35%" SIZE="5" NOSHADE="NOSHADE">    
                        <h2>Find ATMs By City Name</h2>
                        <input type="text" id="input-city" />
                        <input type="submit" name="Submit" id="mysubmit" onclick="find()">
            
                    </CENTER>
                </div>
                </div>
	</div>
       	<div id="list-div" >
	        <table id="list-table" class="display" cellspacing="0" width="100%">
                    <thead>
                    <th>City</th>
                    <th>House Number</th>
                    <th>Street</th>
                    <th>Postal Code</th>
                    <th>Latitude</th>
                    <th>Longitude</th>
                    <th>Type</th>
                </thead>
                    <tbody>
                </tbody>
                </table>
                </div>
       </body>
</html>

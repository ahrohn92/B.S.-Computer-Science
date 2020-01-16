<!-- 	Author: Andrew H. Rohn
		Date: Nov 11, 2018
		File: Week3Discussion.php
		Purpose: Converts Fahrenheit to Celsius
-->

<!DOCTYPE html>
<html>
<head>
	<title>Fahrenheit to Celsius Conversion Table</title>
</head>
<body>
	<h1>Fahrenheit to Celsius Conversion Table</h1> </br></br>
	<table border="4">
		<tr>
			<th>
				Fahrenheit (&#8457)
			</th>
			<th>
				Celsius (&#8451)
			</th>
		</tr>
		<?php
		function tempConv($val) {
			$tempC = ($val - 32) * 5/9;
			return round($tempC, 1);
		}
		
		for ($tempF = 0; $tempF <= 500; $tempF += 25) {
		?>
			<tr>
				<td>
					<?php echo $tempF; ?>
				</td>
				<td>
					<?php echo tempConv($tempF); ?>
				</td>
			</tr>
		<?php
		}
		?>
	</table>
</body>	
</html>
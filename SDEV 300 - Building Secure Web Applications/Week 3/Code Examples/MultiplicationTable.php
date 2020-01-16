<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" >
<html>
   <head>
      <title>Multiplication Table</title>        
   </head>
   <body>
   <h1> Week 3 PHP and HTML Blending </h1>
   <h2>Multiplication Table</h2>

  <!-- First part of table -->
  <table border="1">
  <tr>
     <td>X</td>
     <td>1</td>
     <td>2</td>
     <td>3</td>
     <td>4</td>
     <td>5</td>
     <td>6</td>
     <td>7</td>
     <td>8</td>
     <td>9</td>
     <td>10</td>
   </tr>

     
<!-- Notice interweaving of PHP and HTML -->
    <?php
      $iterations = 10;
      // Nested for loop to calculate product  
      
      for ( $num1=1; $num1 <= $iterations; $num1++ ){
        ?>
        <tr><td><?php echo $num1;?></td>
        <?php
        for ( $num2=1; $num2 <= $iterations; $num2++ ){
         $product = $num1 * $num2;
       ?>
      
         <td><?php echo $product;?> </td>
     <?php 
      }
     ?>
      </tr>
     <?php 
     }
     ?>
   
     </table>

   <p>
   <h3>A quote from Edgar Allan Poe</h3>
   <?php
   // Add a string for manipulation
    $poequote = "I have no faith in human perfectability. I think 
  that human exertion will have no appreciable effect upon humanity.
  Man is now only more active - not more happy - nor more wise, than
  he was 6000 years ago.";

  echo $poequote;
  ?>
  <p>
   <h3>Quote modified with ucwords </h3>
   <?php
   // Make Uppercase for first letter
   $newquote = ucwords($poequote);  
    echo $newquote;
   ?>


   </body>
 </html>

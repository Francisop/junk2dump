/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   "use strict";
   $=jQuery;
	$(function(){
	$('#clean').hide();	
	$('#laund').hide();	
	$('#fumi').hide();	
		
		var activities = document.getElementById("choose");

activities.addEventListener("click", function() {
    var options = activities.querySelectorAll("option");
    var count = options.length;
    if(typeof(count) === "undefined" || count < 2)
    {
        addActivityItem();
    }
});

activities.addEventListener("change", function() {
    if(activities.value === "cls")
    {
       $('#clean').show();
		$('#laund').hide();
		$('#fumi').hide();
    } else if(activities.value === "lds"){
		$('#clean').hide();
		$('#laund').show();
		$('#fumi').hide();
	}else if(activities.value === "pc"){
		$('#clean').hide();
		$('#laund').hide();
		$('#fumi').show();
	}
});


	$('#sht').hide();
	$('#tsht').hide();
	$('#twl').hide();
	$('#btl').hide();
	$('#bts').hide();
	$('#trs').hide();
	$('#jtbl').hide();
	
	$('input[name=shirt]').change(function(){
    if($(this).is(':checked')) {
      $('#sht').show();
    } else {
        $('#sht').hide();
    }	
		
});
		
		$('input[name=tshirt]').change(function(){
    if($(this).is(':checked')) {
      $('#tsht').show();
    } else {
        $('#tsht').hide();
    }
		});
		
			$('input[name=towel]').change(function(){
    if($(this).is(':checked')) {
      $('#twl').show();
    } else {
        $('#twl').hide();
    }
		});
		
			$('input[name=bedsh-lg]').change(function(){
    if($(this).is(':checked')) {
      $('#btl').show();
    } else {
        $('#btl').hide();
    }
		});
		
			$('input[name=bedsh-sm]').change(function(){
    if($(this).is(':checked')) {
      $('#bts').show();
    } else {
        $('#bts').hide();
    }
		});
		
			$('input[name=trouser]').change(function(){
    if($(this).is(':checked')) {
      $('#trs').show();
    } else {
        $('#trs').hide();
    }
		});
		
			$('input[name=jacket]').change(function(){
    if($(this).is(':checked')) {
      $('#jtbl').show();
    } else {
        $('#jtbl').hide();
    }
		});
		
	
	$('#bn').click(function(){
		var cleanprice = 2300;	
	    var room_num = document.getElementById('romnum').value;
		var price = room_num * cleanprice;
		if (room_num.length === 0 || room_num.length === "") {
	  $('#price').text("Price: 0 ");
	}else {
		$('#price').text("Price: " + price);	
	}
			});	
	
		
		
	$('#fbn').click(function (){
          	var fumigationprice = 2300;	
	    var numrom = document.getElementById('numrom').value;
		var price = numrom * fumigationprice;  
            if (numrom.length === ""){
                $('#fumiprice').text("price : 0");
                
            }else {
                $('#fumiprice').text("price :" + price);
            }
        });
        
        
        
	});

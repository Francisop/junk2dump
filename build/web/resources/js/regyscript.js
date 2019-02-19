/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



"use strict";
$(function (){
    var pass = document.getElementById('pass').value;
   $('#name').focusout(function (){
       var name = document.getElementById('name').value;
       if (name.length===0){
          $('#pname').text("fullname cannot be empty");
       }else if (name.length >= 25 ){
           $('#pname').empty();
           $('#pname').text("fullname cannot be more than 25 characters");
       }else {
           $('#pname').empty();
       }
   }); 
   
   $('#email').focusout(function (){
      var email = document.getElementById('email').value;
        if (email.length ===0){
		$('#pemail').text('Email cannot be empty');
		
		
} else if (! /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(email)){
           $('#pemail').empty();
           $('#pemail').text('Email format incorrect');
            }
            else {
              $('#pemail').empty();  
            }
   });
   
   $('#phone').focusout(function (){
     var phone = document.getElementById('phone').value;
     if (!/^[0][1-9]\d{9}$|^[1-9]\d{9}$/g.test(phone)){
         $('#pphone').text('invalid mobile number format - must be 11 digits');
         
     }else if (phone.length === "") {
         $('#pphone').empty();
         $('#pphone').text('Mobile number cannot be empty');
         
     }else {
        $('#pphone').empty(); 
     }
       
       
   });
   $('#pass').focusout(function (){
     
     if( pass.length === "" ){
                 $('#ppass').text('password cannot be empty');
       
     }else if (!/(?=(.*[0-9]))(?=.*[\!@#$%^&*()\\[\]{}\-_+=~`|:;"'<>,./?])(?=.*[a-z])(?=(.*[A-Z]))(?=(.*)).{8,}/g.test(pass)){
         $('#ppass').empty();
          $('#ppass').text('password is too easy');
     } else {
          $('#ppass').empty();
     }
   });
   
   $('#con_pass').focusout(function (){
       var con_pass = document.getElementById('con_pass').value;
       
    if (con_pass.length ===0){
		$('#pcpass').text('password must be confirmed');	
	
		
}else if (con_pass!== pass){
                $('#pcpass').empty();
		$('#pcpass').text('passwords dont match');
	 
       }else{
           $('#pcpass').empty();
       }
   });
   
});
//function sub() {
//	var name = document.getElementById('name').value;
//	var pass = document.getElementById('pass').value;
//	var con_pass = document.getElementById('con_pass').value;
//	var email = document.getElementById('email').value;
//	var phone = document.getElementById('phone').value;
//if(name.length ===0){ 
//	alert('Fullname cannot be empty');
//		return;
//
//	
//}else if (name >=25 ){
//		alert('full name cannot be more than 25 characters');
//		return;	
//	
//		
//		
//}else if (email.length ===0){
//		alert('Email cannot be empty');
//		return;
//		
//}else if (! /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(email)){
//		alert('Email format incorrect');
//		return;
//
//}else if (phone.length ===0){
//		alert('Mobile number cannot be empty');
//		return;
//	
//	}else if (!/^[+]*[(]{0,1}[0-9]{1,3}[)]{0,1}[-\s\./0-9]*$/g.test(phone)){
//		alert('Mobile number format incorrect');
//		return;
//		//
//}else if (phone.length !== 11){
//		alert('Mobile number must be 11 digits only');
//		return;
//	
//}else if( pass.length ===0 ){
//		alert('password cannot be empty');
//		return;
//	
//		
//}else if (con_pass.length ===0){
//		alert('password must be confirmed');	
//	return;
//		
//}else if (con_pass!==pass){
//		alert('passwords dont match');
//	return;
//}
//}
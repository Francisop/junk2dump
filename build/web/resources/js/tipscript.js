/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function(){
		"use strict";
	$('#oil').hide();
	$('#rust').hide();
	$('#gum').hide();
	$('#ink').hide();
	$('#blood').hide();
	$('#armpit').hide();
	
	$('.1').click(function(){
	$('.1').css("color","green");
	$('#oil').hide();
	$('#rust').hide();
	$('#gum').hide();
	$('#ink').hide();
	$('#blood').hide();
	$('#armpit').show();
	});
	
	$('.2').click(function(){
	$('.2').css("color","green");
	$('#oil').hide();
	$('#rust').hide();
	$('#gum').hide();
	$('#ink').hide();
	$('#blood').show();
	$('#armpit').hide();
	});
	
	$('.3').click(function(){
	$('.3').css("color","green");
	$('#oil').hide();
	$('#rust').hide();
	$('#gum').hide();
	$('#ink').show();
	$('#blood').hide();
	$('#armpit').hide();
	});
	
	$('.4').click(function(){
	$('.4').css("color","green");
	$('#oil').hide();
	$('#rust').show();
	$('#gum').hide();
	$('#ink').hide();
	$('#blood').hide();
	$('#armpit').hide();
	});
	
	$('.5').click(function(){
	$('.5').css("color","green");
	$('#oil').show();
	$('#rust').hide();
	$('#gum').hide();
	$('#ink').hide();
	$('#blood').hide();
	$('#armpit').hide();
	});
	
	$('.6').click(function(){
	$('.6').css("color","green");
	$('#oil').hide();
	$('#rust').hide();
	$('#gum').show();
	$('#ink').hide();
	$('#blood').hide();
	$('#armpit').hide();
	});
	});

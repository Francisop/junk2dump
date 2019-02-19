/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
//var dwm_modal = document.getElementsByClassName('dwm_modal');
//var dwm_open = document.getElementByClassName('dwm_open');
//var dwm_close = document.getElementsByClassName('dwm_close')[0];
//
//
//dwm_open.onclick = function() {
//    dwm_modal.style.display = "block";
//};
//
//dwm_close.onclick = function(){
//    dwm_modal.style.display = "none";
//};
//
//window.onclick = funtion(event){
//    if(event.target === dwm_modal){
//        dwm_modal.style.display = "none";
//    }
//    
//}

$(function(){
   $('.dwm_open').click(funtion(){
        $('#dwm_modal').css("display","inlne-block");
   }); 
});


//this is a java code
$(document).ready(function(){
$(".open").on("click", function(){
//$(".popup-content").hide();
$(".c-list").hide();
//$(li[data-spec='memory']).css('color':'red');
});
});

/*function deselect(e) {
  $('.pop').slideFadeToggle(function() {
    e.removeClass('selected');
  });    
}

$(function() {
  $('.open').on('click', function() {
    if($(this).hasClass('selected')) {
      deselect($(this));               
    } else {
      $(this).addClass('selected');
      $('.pop').slideFadeToggle();
    }
    return false;
  });

  $('.close').on('click', function() {
    deselect($('#contact'));
    return false;
  });
});

$.fn.slideFadeToggle = function(easing, callback) {
  return this.animate({ opacity: 'toggle', height: 'toggle' }, 'fast', easing, callback);
};*/

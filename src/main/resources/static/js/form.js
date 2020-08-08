$( document ).ready(function() {
	

	$('#errMsg').text("");
	$('#errMsg').hide("");

$('#fromDate').change(function(){
var d=new Date($('#fromDate').val());
var year = d.getFullYear();

if(year <= "1900") {
 $('#errMsg').show();
$('#errMsg').text("From Year should be >= 1900");
}
});

$('#toDate').change(function(){
var d1=new Date($('#toDate').val());
var year = d1.getFullYear();

if(year <= "1900") {
 $('#errMsg').show();
$('#errMsg').text("To Year should be >= 1900");
}
});


	$('#dateForm').submit(function(){

		if($('#fromDate').val()==''){
			$('#errMsg').show();
			$('#errMsg').text("Please enter the from date");
			return false;

		}else if($('#toDate').val()==''){
			$('#errMsg').show();
			$('#errMsg').text("Please enter the to date");
			return false;

		}else{
			$('#errMsg').text("");
			$('#errMsg').hide("");
			return true;
		}
	});
});

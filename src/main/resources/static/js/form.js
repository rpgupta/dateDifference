$( document ).ready(function() {
	

	$('#errMsg').text("");
	$('#errMsg').hide("");

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

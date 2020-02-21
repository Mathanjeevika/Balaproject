$(document).ready(function() {

	
	$("#student-save").validate({
		submitHandler : function(form) {
			$.ajax({
				type : "POST",
				url : "/student/admin/save",
				data : $(form).serialize(), // serializes the form's elements.
				success : function(data) {
				}
			});
		}
	});
})
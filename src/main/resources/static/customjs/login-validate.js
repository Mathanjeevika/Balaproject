$(document).ready(function() {

	$("#login-form").validate({
		submitHandler : function(form) {
			$.ajax({
				type : "POST",
				url : "loginValidation",
				data : $(form).serialize(), // serializes the form's elements.
				success : function(data) {
					if (data == 200) {
						form.submit();
					} else if (data === 403) {
						alert("Invalid Credentials")
					} else if (data === 401) {
						alert("User is Inactive contact admin")
					}
				}
			});
		}
	});
})
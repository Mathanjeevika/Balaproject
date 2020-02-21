$(document).ready(function() {

	$.ajax({
		type : "GET",
		url : "/student/getDetails",
		success : function(data) {
			if (data && data.edit) {
				$("#firstName").val(data.firstName)
				$("#fatherName").val(data.fatherName)
				$("#mobilePhone").val(data.mobilePhone)
				$("#userName").val(data.userName)
				$("#motherName").val(data.motherName)
				$("#gender").val(data.gender)
				$("#religion").val(data.religion)
				$("#address").val(data.address)
				$("#mail").val(data.mail)
				$("#fathersPhone").val(data.fathersPhone)
				$("#mobilePhone").val(data.mobilePhone)
				$("#mothersPhone").val(data.mothersPhone)
				$("#dateOfBirth").val(data.dateOfBirth)

			} if
				(data && data.edit) {
					$("#sFirstName").text(data.firstName)
					$("#sFatherName").text(data.fatherName)
					$("#sPhone").text(data.mobilePhone)
					$("#sUserName").text(data.userName)
					$("#sMotherName").text(data.motherName)
					$("#sGender").text(data.gender)
					$("#sReligion").text(data.religion)
					$("#sAddress").text(data.address)
					$("#sMail").text(data.mail)
					$("#sFathersPhone").text(data.fathersPhone)
					//$("#sMobilePhone").text(data.mobilePhone)
					$("#sMothersPhone").text(data.mothersPhone)
					$("#sDateOfBirth").text(data.dateOfBirth)
			}
		}
	});

	$("#student-save").validate({
		submitHandler : function(form) {
			console.log($(form).serialize())
			alert(form)
			console.log($(form).serialize())
			alert("1")
			$.ajax({
				type : "POST",
				url : "student/save",
				data : $(form).serialize(), // serializes the form's elements.
				success : function(data) {
					console.log(data)
				}
			});
		}
	});
})
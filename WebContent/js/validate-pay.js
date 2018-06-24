$().ready(function() {

	$("#form-pay").validate({
		onfocusout : false,
		onkeyup : false,
		onclick : false,
		rules : {
			"clientName" : {
				required : true,
			},
			"clientPhone" : {
				required : true,
				number: true,
				minlength: 10,
				maxlength: 11
			},
			"clientAddress" : {
				required : true,
			}
		},
		messages : {
			"clientName" : {
				required : "Vui lòng không bỏ trống trường này!",
			},
			"clientPhone" : {
				required : "Vui lòng không bỏ trống trường này!",
				number: "Vui lòng nhập đúng số điện thoại",
				minlength: "Vui lòng nhập đúng số điện thoại",
				maxlength: "Vui lòng nhập đúng số điện thoại"
			},
			"clientAddress" : {
				required : "Vui lòng không bỏ trống trường này!",
			}
		}
	});

});
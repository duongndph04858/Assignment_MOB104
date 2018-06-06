$().ready(function () {
            $("#form-register").validate({
                onfocusout: false,
                onkeyup: false,
                onclick: false,
                rules: {
                    "register-username": {
                        required: true,
                        maxlength: 15
                    },
                    "register-password": {
                        required: true,
                        minlength: 8
                    },
                    "register-repassword": {
                    	required: true,
                        equalTo: "#inputMatKhauDK",
                    },
                    "register-email":{
                        required: true,
                        email: true
                    }
                },
                messages: {
                    "register-username": {
                    	required: "Vui lòng không bỏ trống trường này!",
                        maxlength: "Tối đa 15 ký tự"
                    },
                    "register-password": {
                    	required: "Vui lòng không bỏ trống trường này!",
                    	 minlength: "Mật khẩu yêu cầu tối thiểu 8 ký tự"
                    },
                    "register-repassword": {
                    	required: "Vui lòng không bỏ trống trường này!",
                        equalTo: "Mật khẩu không khớp!",
                    },
                    "register-email":{
                    	required: "Vui lòng không bỏ trống trường này!",
                        email: "Email phải đúng định dạng"
                    }
                }
            });
        });
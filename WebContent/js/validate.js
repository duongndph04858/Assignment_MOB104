$().ready(function () {
            $("#demoForm").validate({
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
                        equalTo: "#inputMatKhauDK",
                        minlength: 8
                    },
                    "register-email":{
                        required: true,
                        email: true
                    }
                },
                messages: {
                    "register-username": {
                        required: "Vui lòng điền tên đăng nhập",
                        maxlength: "Tối đa 15 ký tự"
                    },
                    "register-password": {
                        required: "Phải điền mật khẩu",
                        minlength: "Tối thiểu 8 ký tự"
                    },
                    "register-repassword": {
                        equalTo: "Mật lại mật khẩu phải giống với mật khẩu",
                        minlength: "Tối thiểu 8 ký tự"
                    },
                    "register-email":{
                        required: "Phải nhập email",
                        email: "Email phải đúng định dạng"
                    }
                }
            });
        });
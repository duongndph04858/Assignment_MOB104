$().ready(function () {
            $("#form-change-password").validate({
                onfocusout: false,
                onkeyup: false,
                onclick: false,
                rules: {
                    "oldPassword": {
                        required: true,
                    },
                    "newPassword": {
                        required: true,
                    },
                    "rePassword": {
                        required: true,
                    }
                },
                messages: {
                    "oldPassword": {
                    	required: "Vui lòng không bỏ trống trường này!",
                    },
                    "newPassword": {
                    	required: "Vui lòng không bỏ trống trường này!",
                    },
                    "rePassword": {
                    	required: "Vui lòng không bỏ trống trường này!",
                    }
                }
            });
            
            
        });
$().ready(function () {
            $("#form-edit-product").validate({
                onfocusout: false,
                onkeyup: false,
                onclick: false,
                rules: {
                    "productID": {
                        required: true,
                    },
                    "productName": {
                        required: true,
                    },
                    "productPrice": {
                        required: true,
                        number: true,
                    },
                    "productAmount": {
                        required: true,
                        number: true,
                    },
                    "productMonitor": {
                        required: true,
                    },
                    "productOS": {
                        required: true,
                    },
                    "productCamera": {
                        required: true,
                    },
                    "productFrontCamera": {
                        required: true,
                    },
                    "productCPU": {
                        required: true,
                    },
                    "productRAM": {
                        required: true,
                        number: true,
                    },
                    "productROM": {
                        required: true,
                        number: true,
                    },
                    "productSIM": {
                        required: true,
                        number: true,
                    },
                    "productPIN": {
                        required: true,
                        number: true,
                    }
                },
                messages: {
                    "productID": {
                    	required: "Vui lòng không bỏ trống trường này!",
                    },
                    "productName": {
                        required: "Vui lòng không bỏ trống trường này!",
                    },
                    "productPrice": {
                        required: "Vui lòng không bỏ trống trường này!",
                        number: "Vui lòng nhập giá là số",
                    },
                    "productAmount": {
                        required: "Vui lòng không bỏ trống trường này!",
                        number: "Vui lòng nhập số lượng là số",
                    },
                    "productMonitor": {
                        required: "Vui lòng không bỏ trống trường này!",
                    },
                    "productOS": {
                        required: "Vui lòng không bỏ trống trường này!",
                    },
                    "productCamera": {
                        required: "Vui lòng không bỏ trống trường này!",
                    },
                    "productFrontCamera": {
                        required: "Vui lòng không bỏ trống trường này!",
                    },
                    "productCPU": {
                        required: "Vui lòng không bỏ trống trường này!",
                    },
                    "productRAM": {
                        required: "Vui lòng không bỏ trống trường này!",
                        number: "Vui lòng nhập dung lượng RAM là số",
                    },
                    "productROM": {
                        required: "Vui lòng không bỏ trống trường này!",
                        number: "Vui lòng nhập dung lượng ROM là số",
                    },
                    "productSIM": {
                        required: "Vui lòng không bỏ trống trường này!",
                        number: "Vui lòng nhập số khe cắm SIM là số",
                    },
                    "productPIN": {
                        required: "Vui lòng không bỏ trống trường này!",
                        number: "Vui lòng nhập dung lượng PIN là số",
                    }
                }
            });
            
        });
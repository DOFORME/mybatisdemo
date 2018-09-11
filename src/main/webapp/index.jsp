<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">

        
        function myClick() {
            var req = {
                name : 'zhang'
            };
            $.ajax({
                type : 'POST',
                url : 'http://localhost:8080/school/student/list',
                data : req,
                async:false,
                // success : function (data) {
                //     console.log(data);
                // }
                success : callBack
            });
        }

        /**
         *
         * @param data
         */
        function callBack(data) {
            var response = data;
        }
    </script>
</head>
<body>
<h2>Hello World!</h2>
<a href="http://localhost:8080/school/student/list" id="test1">test</a>
<label onclick="myClick()">ajax</label>
<br />
${s}
<br />
<%= request.getRequestURL() %>
${request.getRequestURL()}
</body>
</html>

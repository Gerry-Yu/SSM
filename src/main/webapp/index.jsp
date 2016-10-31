<%--
  Created by IntelliJ IDEA.
  User: Pinggang Yu
  Date: 2016/9/24
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap-table.css">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>

    <script src="js/bootstrap-table.js"></script>
    <script src="js/bootstrap-table-zh-CN.js"></script>
    <script>
        $(document).ready(function () {
            $('#table').bootstrapTable({
                method: 'post',
                contentType: "application/x-www-form-urlencoded",
                striped: true,
                pagination: true,
                pageSize: 5,
                pageNumber:1,
                search: false,
                showColumns: false,
                sidePagination: "server",
                queryParamsType : "undefined",
                queryParams: function queryParams(params) {
                    var param = {
                        pageNumber: params.pageNumber,
                        pageSize: params.pageSize,
                    };
                    return param;
                },
                cache: false,
                sortable: false,
                sortOrder: "asc",
                height: 400,
                pageList: [5, 10, 25],
                url: 'getUsers',
                columns: [{
                    field: 'userId',
                    title: 'userId'
                }, {
                    field: 'userName',
                    title: 'userName'
                }]
            });
        })

    </script>

</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">
        Table
    </div>
    <div class="panel-body">
        <table id="table"></table>
    </div>
</div>
</body>
</html>

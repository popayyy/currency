<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Currency widget</title>

    <!-- Bootstrap -->
    <asset:stylesheet src="bootstrap.css"/>
</head>

<body>

<div class="page-header">
    <h1>Курсы USD, EUR</h1>
</div>

<div>
    <ul class="nav nav-tabs">
        <li role="presentation" id="nav_table" class="active">
            <a href="#">Table</a>
        </li>
        <li role="presentation" id="nav_graph">
            <a href="#">Graph</a>
        </li>
    </ul>

    <div class="tab-content" id="myTabContent">
        <g:render template="table" model="[]" />
    </div>
</div>


%{--<asset:javascript src="bootstrap.js"/>--}%
<asset:javascript src="jquery-2.2.0.min.js"/>
<asset:javascript src="currency.js"/>
</body>
</html>
$(document).off('click', '#nav_table');
$(document)
    .on('click', '#nav_table', function (e) {
        $("#nav_graph").removeClass('active');
        $("#nav_table").addClass('active');
    });

$(document).off('click', '#nav_graph');
$(document)
    .on('click', '#nav_graph', function (e) {
        $("#nav_table").removeClass('active');
        $("#nav_graph").addClass('active');
    });
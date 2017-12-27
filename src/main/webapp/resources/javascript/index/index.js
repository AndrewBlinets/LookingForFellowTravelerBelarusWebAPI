$(document).ready(function(){
    var mas_information;
    var now = new Date();
    var curr_date = now.getDate();
    var curr_month = now.getMonth() + 1;
    var curr_year = now.getFullYear();
    if(curr_date > 10)
    $(".calendar_finish").val(curr_year + "-" + curr_month + "-" + curr_date);
    else
        $(".calendar_finish").val(curr_year + "-" + curr_month + "-0" + curr_date);
    $(".calendar_start").val(curr_year + "-" + curr_month + "-01");
    var startData = new Date();
    startData.setDate(100);
    $(".calendar_start").val();
    $(".button-for-result").on('click', function() {
        $('.error-message').text("");
        $("#tbody").empty();
        var start = $(".calendar_start").val();
        var finish = $(".calendar_finish").val();
        $.ajax({
                type : 'POST',
                //url: '/oais-form/getInformation',
                url: '/getInformation',
                data: JSON.stringify({ 'start': start,
                    'finish': finish }),
                contentType: 'application/json; charset=utf-8',
                dataType: 'json',
                success: function(data) {
                    $('#table').show();

                    mas_information = data;
                    for (var i = 0; i < mas_information.length; i++) {
                        var data = new Date(mas_information[i].dataCreate);
                        $('#tbody').append('<tr class="str'+ i +'">' +
                            '<td>' + mas_information[i].id + '</td>' +
                            '<td>' + mas_information[i].categoryName + '</td>' +
                            '<td>' + mas_information[i].serviceKod + '</td>' +
                            '<td>' + mas_information[i].serviceName + '</td>' +
                            '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                            '<td>' + mas_information[i].comment + '</td>' +
                            '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                            "." + data.getFullYear() + " " + data.getHours() + ":" +
                            data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                            '</tr>');
                        if(i%2 == 0)
                        {
                            $(".str" + i).css('background', '#ffe');
                        }
                    }
                    },
                error: function(error) {
                    $('#table').hide();
                    $('.error-message').text(error.responseText.split('$')[1]);
                }
            });
    });
    $(".button-for-all-result").on('click', function() {
        $('.error-message').text("");
        $("#tbody").empty();
        $.ajax({
                type : 'GET',
               // url: '/oais-form//getAllInformation',
                url: '/getAllInformation',
                contentType: 'application/json; charset=utf-8',
                dataType: 'json',
                success: function(data) {
                    $('#table').show();
                    $("#tbody").empty();
                    mas_information = data;
                    for (var i = 0; i < mas_information.length; i++) {
                        var data = new Date(mas_information[i].dataCreate);
                        $('#tbody').append('<tr class="str'+ i +'">' +
                            '<td>' + mas_information[i].id + '</td>' +
                            '<td>' + mas_information[i].categoryName + '</td>' +
                            '<td>' + mas_information[i].serviceKod + '</td>' +
                            '<td>' + mas_information[i].serviceName + '</td>' +
                            '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                            '<td>' + mas_information[i].comment + '</td>' +
                            '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                            "." + data.getFullYear() + " " + data.getHours() + ":" +
                            data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                            '</tr>');
                        if(i%2 == 0)
                        {
                            $(".str" + i).css('background', '#ffe');
                        }
                    }
                    },
                error: function(xhr) {
                    $('.error-message').text(error.responseText.split('$')[1]);
                }
            });
    });
    $(".by-id-down").on('click',function(){
        mas_information.sort(compareByIDDesk);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-id-up").on('click',function(){
        mas_information.sort(compareByIDAsc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-name-category-down").on('click',function(){
        mas_information.sort(compareByCategoryNameDesc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-name-category-up").on('click',function(){
        mas_information.sort(compareByCategoryNameAsc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-cod-service-down").on('click',function(){
        mas_information.sort(compareByServiceKodDesc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-cod-service-up").on('click',function(){
        mas_information.sort(compareByServiceKodAsc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-name-service-down").on('click',function(){
        mas_information.sort(compareByServiceNameDesc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-name-service-up").on('click',function(){
        mas_information.sort(compareByServiceNameAsc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-org-down").on('click',function(){
        mas_information.sort(compareByOrganizationNameAndUnnDesc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-org-up").on('click',function(){
        mas_information.sort(compareByOrganizationNameAndUnnAsc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-comment-down").on('click',function(){
        mas_information.sort(compareByCommentDesc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-comment-up").on('click',function(){
        mas_information.sort(compareByCommentAsc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-date-down").on('click',function(){
        mas_information.sort(compareByDataAsc);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
    $(".by-date-up").on('click',function(){
        mas_information.sort(compareByDataDesk);
        $("#tbody").empty();
        for (var i = 0; i < mas_information.length; i++) {
            var data = new Date(mas_information[i].dataCreate);
            $('#tbody').append('<tr class="str'+ i +'">' +
                '<td>' + mas_information[i].id + '</td>' +
                '<td>' + mas_information[i].categoryName + '</td>' +
                '<td>' + mas_information[i].serviceKod + '</td>' +
                '<td>' + mas_information[i].serviceName + '</td>' +
                '<td>' + mas_information[i].organizationNameAndUnn + '</td>' +
                '<td>' + mas_information[i].comment + '</td>' +
                '<td>' + data.getDate() + "." + (data.getMonth() + 1) +
                "." + data.getFullYear() + " " + data.getHours() + ":" +
                data.getMinutes() + ":" + data.getSeconds() + '</td>' +
                '</tr>');
            if(i%2 == 0)
            {
                $(".str" + i).css('background', '#ffe');
            }
        }
    });
});

function compareByIDDesk(obj1, obj2)
{
    return obj2.id - obj1.id;
}
function compareByIDAsc(obj1, obj2)
{
    return obj1.id - obj2.id;
}
function compareByCategoryNameAsc(obj1, obj2) {
    if (obj1.categoryName > obj2.categoryName) {
        return 1;
    }
    if (obj1.categoryName < obj2.categoryName) {
        return -1;
    }
    return 0;
}
function compareByCategoryNameDesc(obj1, obj2) {
    if (obj1.categoryName < obj2.categoryName) {
        return 1;
    }
    if (obj1.categoryName > obj2.categoryName) {
        return -1;
    }
    return 0;
}
function compareByServiceKodAsc(obj1, obj2) {
    if (obj1.serviceKod > obj2.serviceKod) {
        return 1;
    }
    if (obj1.serviceKod < obj2.serviceKod) {
        return -1;
    }
    return 0;
}
function compareByServiceKodDesc(obj1, obj2) {
    if (obj1.serviceKod < obj2.serviceKod) {
        return 1;
    }
    if (obj1.serviceKod > obj2.serviceKod) {
        return -1;
    }
    return 0;
}
function compareByServiceNameAsc(obj1, obj2) {
    if (obj1.serviceName > obj2.serviceName) {
        return 1;
    }
    if (obj1.serviceName < obj2.serviceName) {
        return -1;
    }
    return 0;
}
function compareByServiceNameDesc(obj1, obj2) {
    if (obj1.serviceName < obj2.serviceName) {
        return 1;
    }
    if (obj1.serviceName > obj2.serviceName) {
        return -1;
    }
    return 0;
}
function compareByOrganizationNameAndUnnAsc(obj1, obj2) {
    if (obj1.organizationNameAndUnn > obj2.organizationNameAndUnn) {
        return 1;
    }
    if (obj1.organizationNameAndUnn < obj2.organizationNameAndUnn) {
        return -1;
    }
    return 0;
}
function compareByOrganizationNameAndUnnDesc(obj1, obj2) {
    if (obj1.organizationNameAndUnn < obj2.organizationNameAndUnn) {
        return 1;
    }
    if (obj1.organizationNameAndUnn > obj2.organizationNameAndUnn) {
        return -1;
    }
    return 0;
}
function compareByCommentAsc(obj1, obj2) {
    if (obj1.comment > obj2.comment) {
        return 1;
    }
    if (obj1.comment < obj2.comment) {
        return -1;
    }
    return 0;
}
function compareByCommentDesc(obj1, obj2) {
    if (obj1.comment < obj2.comment) {
        return 1;
    }
    if (obj1.comment > obj2.comment) {
        return -1;
    }
    return 0;
}

function compareByDataDesk(obj1, obj2) {
    if (obj1.dataCreate > obj2.dataCreate) {
        return 1;
    }
    if (obj1.dataCreate < obj2.dataCreate) {
        return -1;
    }
    return 0;
}function compareByDataAsc(obj1, obj2) {
    if (obj1.dataCreate < obj2.dataCreate) {
        return 1;
    }
    if (obj1.dataCreate > obj2.dataCreate) {
        return -1;
    }
    return 0;
}
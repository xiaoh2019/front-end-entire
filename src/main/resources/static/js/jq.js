$(document).ready(function () {
    $("#button1").click(function () {
        $.ajax({
            url: "/addUser",
            data: {name: 'jenny',age:12},
            type: "POST",
            dataType: "json",
            success: function(data) {
                alert(typeof (data))
                alert(JSON.stringify(data))
                alert(typeof (JSON.stringify(data)))
            }
        });
    });



    $("#button2").click(function () {
        var a = { name:"Bill Gates", age:62, city:"Seattle"};
        alert(typeof (a))
        alert(a.name + a.age)
        var b = { "name":"Bill Gates", "age":62, "city":"Seattle"};
        alert(typeof (b))
        alert(b.name + b.age + b.city)
    })

    //参数1位事件名，参数二为方法名
    document.getElementById("btn1").addEventListener("click", fun1)
    function fun1() {
        alert("aa")
    }

    // show() hide()方法
    $("#b1").click(function () {
        $("#p1").show()
    })
    $("#b2").click(function () {
        $("#p1").hide()
    })

    //淡入淡出
    $("#b3").click(function () {
        $("#p1").fadeIn(1000)
    })
    $("#b4").click(function () {
        $("#p1").fadeOut(1000)
    })
    //滑动
    $("#b5").click(function () {
        $("#p1").slideDown("slow")
    })
    $("#b6").click(function () {
        $("#p1").slideUp("slow")
    })
    $("#b7").click(function () {
        $("#p1").slideToggle("slow")
    })

    //动画
    $("#b8").click(function () {
        i = 0
        while (i < 10){
            //参数是css属性
            //$("#d1").animate({left:"200px"},"slow")
            $("#d1").animate({right:"200px"},"slow")
            i = i + 1
        }

    })

    //js原生获取内容
    document.getElementById("b9").addEventListener("click", fun8)

    function fun8(){
        var a = document.getElementById("p").innerText
        alert(a)
    }
    //jquery获取元素内容
    $("#b10").click(function () {
        alert($("#p").text())
    })

    //整个元素
    $("#b11").click(function () {
        alert($("#p").html())
    })

    //获取表单字段的值 input
    $("#b12").click(function () {
        alert($("#t1").val())
    })
    //获取属性
    $("#b13").click(function () {
        //参数属性名
        alert($("#t1").attr("type"))
    })

    //修改段落的内容
    $("#b14").click(function () {
        $("#p").text("hello 我改变了你")
    })

    //把整个元素都改变
    $("#b15").click(function () {
        alert("111")
        $("#p").html("<a href='www.baidu.com'>这是一个连接</a>")
    })

    //修改连接属性
    $("#b16").click(function () {
        $("#h1").attr({
            "href":"http://www.baidu.com",
            "title":"百度连接"
        })
    })

    //get请求
    $("#b17").click(function () {
        //第一个参数是请求路径，第二个参数是数据这里省略了，第三个参数是回调函数
        $.get("/addUser?name=王二&age=18", function (response, status) {
            alert(JSON.stringify(response))
            alert(status)
        })
    })

    $("#b18").click(function () {
        //第一个参数是请求路径，第二个参数是数据，第三个参数是回调函数
        $.post("/addUser",{name:"王二",age:18},function (response, status) {
            alert(JSON.stringify(response))
            alert(status)
        })
    })

})
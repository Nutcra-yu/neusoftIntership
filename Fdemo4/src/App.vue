<script setup>
import {ref} from 'vue'
 
 
//data
const count=ref(0)
const msg=ref('this is my message')
const msg2=ref('<font color="blue" >this is my message</font>')
const myClass=ref("")
const isShow=ref({
    isRed:false,
    isFont:true
     
})
const num=ref(1)
 
const is=ref(true)
 
//v-for
const fruits=ref(["pear","banana","orange"])
const user=ref({
    uid:"20200101",
    uname:"张三",
    sex:"男",
    age:20
})
//购物车中商品集合
const goods=ref([
    {
        gid:"001",gname:"巧克力",num:10,price:9
    },
    {
        gid:"002",gname:"酸奶",num:2,price:5
    },
    {
        gid:"003",gname:"薯片",num:1,price:10
    }
])
 
 
 
function mytest(){
    console.log("aaaaaa")
 
}
//等价上面函数
const add=()=>{
    num.value++;
}
 
const reduce=()=>{
    num.value=num.value<=1?1:num.value-1;
}
 
 
</script>
 
<template>
    <h1>这是我的Vue3</h1>
    <button @click="count++"  @mouseover="mytest()" >{{count}}</button>

    
    <br><br><br><br>
    <h2>文本绑定</h2>
    <h3 v-text="msg"></h3>
    <h3 v-html="msg"></h3>
    <h3>{{msg}}</h3>
    <input  v-model="msg"/>
    <br>
    <h3 v-text="msg2"></h3>
    <h3 v-html="msg2"></h3>
    <h3>{{msg2}}</h3>
    <input  v-model="msg2"/>
     

    <br><br><br><br>
    <h2>属性绑定</h2>
    <p title="这是提示"> 桃花潭水深千尺 </p>
    <p :title="msg"> 桃花潭水深千尺 </p>
    <p :class="myClass"> 桃花潭水深千尺 </p>
    <input v-model="myClass"/>
    <p :class="{red:isShow.isRed,font25:isShow.isFont}"> 桃花潭水深千尺 </p>
    <input v-model="isShow.isRed"/>
    <input v-model="isShow.isFont"/>
     

    <br><br><br><br>
    <h2>事件绑定</h2>
    <button @click="reduce()">-</button><input  v-model="num"/><button @click="add()">+</button>
    <br>
    <button @click="count=count<=1?count:count-1">-</button><input  v-model="count"/><button @click="count++">+</button>
     

    <br><br><br><br>
    <h2>条件指令</h2>
    <h3>v-if  、v-show</h3>
    <img src="../images/image.png" title="v-if" v-if="is" /><br>
    <img src="../images/image.png" title="v-show" v-show="is" /><br />
    <button @click="is=!is">切换</button>
     

    <br><br><br><br>
    <h2>循环指令 v-for</h2>
    <!-- foreach -->
    <h3>遍历绑定简单集合</h3>
    <ul>
        <li v-for="f in fruits">{{f}}</li>
    </ul>
     
    <ul>
        <li v-for="f,i in fruits">{{i}}-{{f}}</li>
    </ul>
     
    <h3>遍历绑定简单对象</h3>
    <ul>
        <!-- v-for="值,键,索引 in 对象"  -->
        <li v-for="u,k,i in user">{{i}}-{{k}}-{{u}}</li>
    </ul>
     
    <h3>遍历绑定复杂集合对象</h3>
    <table>
        <tbody>
            <tr>
                <td>编号</td>
                <td>名称</td>
                <td>单价</td>
                <td>数量</td>
                <td>小计</td>
            </tr>
             
            <tr v-for="g in goods">
                <td>{{g.gid}}</td>
                <td>{{g.gname}}</td>
                <td>￥{{g.price}}</td>
                <td>{{g.num}}</td>
                <td>￥{{g.price*g.num}}</td>
            </tr>
        </tbody>
    </table>
     
    <br />
    <br />
    <br />
    <br />
    <br />
    <br />
     
     
     
</template>
 
<style>
.red{
    color: crimson;
 
}   
 
.font25{
    font-size: 25px;
}
 
.blue{
    color: cornflowerblue;
}
     
</style>
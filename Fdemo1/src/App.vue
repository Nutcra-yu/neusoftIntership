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
     
    <h2>属性绑定</h2>
    <p title="这是提示"> 桃花潭水深千尺 </p>
    <p :title="msg"> 桃花潭水深千尺 </p>
    <p :class="myClass"> 桃花潭水深千尺 </p>
    <input v-model="myClass"/>
     
    <br />
    <p :class="{red:isShow.isRed,font25:isShow.isFont}"> 桃花潭水深千尺 </p>
    <input v-model="isShow.isRed"/>
    <input v-model="isShow.isFont"/>
     
    <h2>事件绑定</h2>
    <button @click="reduce()">-</button><input  v-model="num"/><button @click="add()">+</button>
    <br>
    <button @click="count=count<=1?count:count-1">-</button><input  v-model="count"/><button @click="count++">+</button>
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
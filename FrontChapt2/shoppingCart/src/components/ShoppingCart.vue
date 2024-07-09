<template>
	<h1>我的购物车</h1>
	
	<table class="el-table" >
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
			<td>  
			<button @click="g.num=g.num<=1?1:g.num-1">-</button>
			<input type="number" v-model="g.num"/>
			<button @click="g.num++">+</button>
			</td>
			<td>￥{{g.price*g.num}}</td>
		</tr>
	</table>
	<table>
		<td>
			<tr>1</tr>
			<tr>2</tr>
			<tr>3</tr>
		</td>
	</table>
	<table>
		<tr>
			<td>1.1</td>
			<td>1.2</td>
			<td>1.3</td>
		</tr>
	</table>
	
	
	<h2>Element-plus</h2>
	 <el-table :data="goods" stripe style="width: 100%">
	    <el-table-column prop="gid" label="编号" width="180" />
	    <el-table-column prop="gname" label="名称" width="180" />
	    <el-table-column prop="price" label="单价" />
		<el-table-column prop="num" label="数量" />
	  </el-table>
</template>

<script setup>
import {ref,computed} from 'vue'

//data 当前组件对象的属性
const goods=ref([
	// {键:值,键:值...}
	{gid:"001",gname:"奇趣蛋",price:9,num:1},
	{gid:"002",gname:"酸奶",price:5,num:2},
	{gid:"003",gname:"薯片",price:10,num:2},
])

//使用计算属性 统计总价
//当goods集合内的值发生变化
const total=computed(() => {
	var sum=0
	goods.forEach((g)=>{
		sum+=g.price*g.num
	})
	return sum;
	
})

	
	
</script>

<style>
</style>
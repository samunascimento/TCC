// import React, { Component } from 'react';
// import * as d3 from 'd3';
// export default class Chart extends React.Component {
//     render(){

//         const colors = [
//             'steelblue',
//             'green',
//             'red',
//             'purple',
//           'black'
//         ]

//         //************************************************************
// // Create Margins and Axis and hook our zoom function
// //************************************************************
//     const margin = {top: 20, right: 30, bottom: 30, left: 50}
//     const width = 960 - margin.left - margin.right
//     const height = 500 - margin.top - margin.bottom;

//     const x = d3.scale.linear()
//     .domain([0, 12])
//     .range([0, width]);

//     const y = d3.scale.linear()
//     .domain([ 0, 30])
//     .range([height, 0]);

//     const xAxis = d3.svg.axis()
//     .scale(x)
//     .tickSize(-height)
//     .tickPadding(10)	
//     .tickSubdivide(true)	
//     .orient("bottom");	

//     const yAxis = d3.svg.axis()
//     .scale(y)
//     .tickPadding(10)
//     .tickSize(-width)
//     .tickSubdivide(true)	
//     .orient("left");

//     const zoom = d3.zoom()
//     .x(x)
//     .y(y)
//     .scaleExtent([0, 30])
//     .on("zoom", () =>  {
//         svg.select(".x.axis").call(xAxis);
//         svg.select(".y.axis").call(yAxis);   
//         svg.selectAll('path.line').attr('d', line);  
    
//         points.selectAll('circle').attr("transform", function(d) { 
//             return "translate(" + x(d.point.x) + "," + y(d.point.y) + ")"; }
//         );  
//     });
// //*********************************************************
// // Generate our SVG object
// //*********************************************************

//     const svg = d3.select("body").append("svg")
//     .call(zoom)
//     .attr("width", width + margin.left + margin.right)
//     .attr("height", height + margin.top + margin.bottom)
//     .append("g")
//     .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

//     svg.append("g")
//     .attr("class", "x axis")
//     .attr("transform", "translate(0," + height + ")")
//     .call(xAxis);

//     svg.append("g")
//     .attr("class", "y axis")
//     .call(yAxis);

//     svg.append("g")
//     .attr("class", "y axis")
//     .append("text")
//     .attr("class", "axis-label")
//     .attr("transform", "rotate(-90)")
//     .attr("y", (-margin.left) + 10)
//     .attr("x", -height/2)
//     .text('value');	

//     svg.append("clipPath")
//     .attr("id", "clip")
//     .append("rect")
//     .attr("width", width)
//     .attr("height", height);


// //*********************************************************
// // Create D3 line object and draw data on our SVG object
// //*********************************************************
//     const line = d3.svg.line()
//     .interpolate("linear")	
//     .x(function(d) { return x(d.x); })
//     .y(function(d) { return y(d.y); });		

//     svg.selectAll('.line')
//     .data(data)
//     .enter()
//     .append("path")
//     .attr("class", "line")
//     .attr("clip-path", "url(#clip)")
//     .attr('stroke', function(d,i){ 			
//         return colors[i%colors.length];
//     })
//     .attr("d", line);		



// //************************************************************
// // Draw points on SVG object based on the data given
// //************************************************************
//     const points = svg.selectAll('.dots')
//         .data(data)
//         .enter()
//         .append("g")
//         .attr("class", "dots")
//         .attr("clip-path", "url(#clip)");	
    
//     points.selectAll('.dot')
//         .data(function(d, index){ 		
//             var a = [];
//             d.forEach(function(point,i){
//                 a.push({'index': index, 'point': point});
//             });		
//             return a;
//         })
//         .enter()
//         .append('circle')
//         .attr('class','dot')
//         .attr("r", 2.5)
//         .attr('fill', function(d,i){ 	
//             return colors[d.index%colors.length];
//         })	
//         .attr("transform", function(d) { 
//             return "translate(" + x(d.point.x) + "," + y(d.point.y) + ")"; }
//         );




//         return(
//         <svg height={svgHeight} width={svgWidth}>
//             <g transform={`translate(${margin.left},${margin.top})`}>
//                 <AxisBottom {...axisBottomProps} />
//                 <AxisLeft {...axisLeftProps} />
//                 <Bars {...barProps} />
//             </g>
//       </svg>
//         )
//     }
// }
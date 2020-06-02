// BarChart.js
import * as d3 from 'd3';
import React, { useRef, useEffect } from 'react';
import './Style.css'

function BarChart({ width, height, data }){

    const ref = useRef();

    useEffect(() => {
        
        const svg = d3.select(ref.current)
            .attr("width", width)
            .attr("height", height)
            .append("g")
    }, []);

    useEffect(() => {
        draw();
    }, [data]);

    const draw = () => {
        
        const colors = [
            'steelblue',
            'green',
            'red',
            'purple',
          'black'
        ]


        const svg = d3.select(ref.current);
        var selection = svg.selectAll("rect").data(data);

        //CREATE MARGINS AND AXIS


        const x = d3.scaleLinear()
        .domain([0, 12])
        .range([0, width]);

        const y = d3.scaleLinear()
        .domain([ 0, 30])
        .range([height, 0]);


        const xAxis = d3.axisBottom(x)
        .tickSize(-height)
        .tickPadding(10);
        //.tickSubdivide(true)
        //.orient("bottom");	

        const yAxis = d3.axisLeft(y)
        .tickPadding(10)
        .tickSize(-width);
        //.tickSubdivide(true)	
        //.orient("left");

        
        //GENERATE SVG OBJECT


        svg.append("g")
        .attr("class", "x axis")
        .attr("transform", "translate(0," + height + ")")
        .call(xAxis);

        svg.append("g")
        .attr("class", "y axis")
        .call(yAxis);

        svg.append("g")
        .attr("class", "y axis")
        .append("text")
        .attr("class", "axis-label")
        .attr("transform", "rotate(-90)")
        .attr("y", (-width) + 10)
        .attr("x", -height/2)
        .text('value');	

        svg.append("clipPath")
        .attr("id", "clip")
        .append("rect")
        .attr("width", width)
        .attr("height", height);


        

        

        // const zoom = d3.zoom()
        // .x(x)
        // .y(y)
        // .scaleExtent([0, 30])
        // .on("zoom", () =>  {
        //     svg.select(".x.axis").call(xAxis);
        //     svg.select(".y.axis").call(yAxis);   
        //     svg.selectAll('path.line').attr('d', line);  
        
        //     points.selectAll('circle').attr("transform", function(d) { 
        //         return "translate(" + x(d.point.x) + "," + y(d.point.y) + ")"; }
        //     );  
        // });


        //CREATE LINE

        const line = d3.line()
        .x(function(d) { return x(d.x); })
        .y(function(d) { return y(d.y); })
        .curve(d3.curveLinear);

        svg.selectAll('.line')
        .data(data)
        .enter()
        .append("path")
        .attr("class", "line")
        .attr("clip-path", "url(#clip)")
        .attr('stroke', function(d,i){ 			
            return colors[i%colors.length];
        })
        .attr("d", line);	

        //CREATE POINTS

        const points = svg.selectAll('.dots')
        .data(data)
        .enter()
        .append("g")
        .attr("class", "dots")
        .attr("clip-path", "url(#clip)");	
    
        points.selectAll('.dot')
        .data(function(d, index){ 		
            var a = [];
            d.forEach(function(point,i){
                a.push({'index': index, 'point': point});
            });		
            return a;
        })
        .enter()
        .append('circle')
        .attr('class','dot')
        .attr("r", 2.5)
        .attr('fill', function(d,i){ 	
            return colors[d.index%colors.length];
        })	
        .attr("transform", function(d) { 
            return "translate(" + x(d.point.x) + "," + y(d.point.y) + ")"; }
        );



        // var yScale = d3.scaleLinear()
        //                     .domain([0, d3.max(data)])
        //                     .range([0, height-100]);
        
        // selection
        //     .transition().duration(300)
        //         .attr("height", (d) => yScale(d))
        //         .attr("y", (d) => height - yScale(d))

        // selection
        //     .enter()
        //     .append("rect")
        //     .attr("x", (d, i) => i * 45)
        //     .attr("y", (d) => height)
        //     .attr("width", 40)
        //     .attr("height", 0)
        //     .attr("fill", "orange")
        //     .transition().duration(300)
        //         .attr("height", (d) => yScale(d))
        //         .attr("y", (d) => height - yScale(d))
        
        // selection
        //     .exit()
        //     .transition().duration(300)
        //         .attr("y", (d) => height)
        //         .attr("height", 0)
        //     .remove()
    }


    return (
        <div className="chart">
            <svg ref={ref}>
            </svg>
        </div>
        
    )

}

export default BarChart;
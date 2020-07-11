// BarChart.js
import * as d3 from 'd3';
import React, { useRef, useEffect } from 'react';
import './Style.css'

function BarChart({ data }) {

    const ref = useRef();

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

        const margin = { top: 20, right: 30, bottom: 30, left: 50 }
        const width = 960 - margin.left - margin.right
        const height = 500 - margin.top - margin.bottom

        const zoom = () => d3.zoom()
            .x(x)
            .y(y)
            .scaleExtent([0, 30])
            .on("zoom", () => {
                svg.select(".x.axis").call(xAxis);
                svg.select(".y.axis").call(yAxis);
                svg.selectAll('path.line').attr('d', line);

                points.selectAll('circle').attr("transform", function (d) {
                    return "translate(" + x(d.point.x) + "," + y(d.point.y) + ")";
                }
                );
            });


        const svg = d3.select(ref.current)
            .attr("width", width + margin.left + margin.right)
            .attr("height", height + margin.top + margin.bottom)
            .append("g")
            .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

        //CREATE MARGINS AND AXIS


        const x = d3.scaleLinear()
            .domain([0, 50])
            .range([0, width]);

        const y = d3.scaleLinear()
            .domain([0, 1000])
            .range([height, 0]);


        const xAxis = d3
            .axisBottom(x)
            .tickSize(-height)
            .ticks(10)
        //  .tickSubdivide(true)

        const yAxis = d3
            .axisLeft(y)
            .ticks(10)
            .tickSize(-width);
        // .tickSubdivide(true)	


        //GENERATE SVG OBJECT


        svg.append("g")
            .attr("class", "x axis")
            .attr("transform", "translate(0," + height + ")")
            .call(xAxis);

        svg.append("g")
            .attr("class", "y axis")
            .call(yAxis)

        svg.append("g")
            .attr("class", "y axis")
            .append("text")
            .attr("class", "axis-label")
            .attr("transform", "rotate(-90)")
            .attr("y", (-margin.left) + 10)
            .attr("x", -height / 2)
            .text('value');


        svg.append("g")
            .attr("class", "x axis")
            .append("text")
            .attr("class", "axis-label")
            .attr("y", (height + 30))
            .attr("x", width / 2)
            .text('date');



        svg.append("clipPath")
            .attr("id", "clip")
            .append("rect")
            .attr("width", width)
            .attr("height", height)


        //CREATE LINE

        // var lineGenerator = d3.line()
        //    .defined(function (d) {
        //       return d !== null;
        //   });

        const line = d3.line()
            .defined(function (d) {
                return d !== null;
            })
            .x(function (d) { return x(d.x); })
            .y(function (d) { return y(d.y); });

             svg.selectAll('.line')
            .data(data)
            .enter()
            .append("path")
            .attr("class", "line")
            .attr("clip-path", "url(#clip)")
            .attr('stroke', function (d, i) {
                return colors[i % colors.length];
            })
            .attr("d", line)
            
            if(data.length == 0){
            d3.selectAll(".line").remove();
            }        

        //CREATE POINTS

        const points = svg.selectAll('.dots')
            .data(data)
            .enter()
            .append("g")
            .attr("class", "dots")
            .attr("clip-path", "url(#clip)");

        points.selectAll('.dot')
            .data(function (d, index) {
                var a = [];
                d.forEach(function (point, i) {
                    a.push({ 'index': index, 'point': point });
                });
                return a;
            })
            .enter()
            .append('circle')
            .attr('class', 'dot')
            .attr("r", 2.5)
            .attr('fill', function (d, i) {
                return colors[d.index % colors.length];
            })

           // svg.exit() 
           // .remove
        //.attr("transform", function (d) {
        //    return "translate(" + x(d.point.x) + "," + y(d.point.y) + ")";
        // }
        // );



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
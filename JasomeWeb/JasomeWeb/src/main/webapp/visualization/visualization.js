/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//data
var data = [
  {
    year: 1,
    popularity: 50
  },
  {
    year: 2,
    popularity: 150
  },
  {
    year: 3,
    popularity: 200
  },
  {
    year: 4,
    popularity: 130
  },
  {
    year: 5,
    popularity: 240
  },
  {
    year: 6,
    popularity: 380
  },
  {
    year: 7,
    popularity: 420
  },
  {
    year: 8,
    popularity: 50
  },
  {
    year: 9,
    popularity: 150
  },
  {
    year: 10,
    popularity: 200
  }
];


const svg = d3
  .select("#chart")
  .append("svg")
  .attr("height", 300)
  .attr("width", 600);

const margin = { top: 0, bottom: 20, left: 30, right: 20 };
const chart = svg.append("g").attr("transform", `translate(${margin.left},0)`);
const width = +svg.attr("width") - margin.left - margin.right;
const height = +svg.attr("height") - margin.top - margin.bottom;
const grp = chart
  .append("g")
  .attr("transform", `translate(-${margin.left},-${margin.top})`);

chart.append("g").attr("class", "x-axis");
chart.append("g").attr("class", "y-axis");


const path = grp
  .append("path")
  .attr("transform", `translate(${margin.left},0)`)
  .attr("fill", "none")
  .attr("stroke", "steelblue")
  .attr("stroke-linejoin", "round")
  .attr("stroke-linecap", "round")
  .attr("stroke-width", 1.5);



function updateScales(data) {
  // Create scales
  const yScale = d3
    .scaleLinear()
    .range([height, 0])
    .domain([0, d3.max(data, dataPoint => dataPoint.popularity)]);
  const xScale = d3
    .scaleLinear()
    .range([0, width])
    .domain(d3.extent(data, dataPoint => dataPoint.year));
  return { yScale, xScale };
}

function createLine(xScale, yScale) {
  return line = d3
  .line()
  .x(dataPoint => xScale(dataPoint.year))
  .y(dataPoint => yScale(dataPoint.popularity))
  .curve(d3.curveMonotoneX);
}

function updateAxes(data, chart, xScale, yScale) {
  chart
    .select(".x-axis")
    .attr("transform", `translate(0,${height})`)
    .call(d3.axisBottom(xScale).ticks(data.length));
  chart
    .select(".y-axis")
    .attr("transform", `translate(0, 0)`)
    .call(d3.axisLeft(yScale));
}

function updatePath(data, line) {
  const updatedPath = d3
    .select("path")
    .interrupt()
    .datum(data)
    .attr("d", line);

  const pathLength = updatedPath.node().getTotalLength();

  const transitionPath = d3
    .transition()
    .ease(d3.easeSin)
    .duration(2500);
  updatedPath
    .attr("stroke-dashoffset", pathLength)
    .attr("stroke-dasharray", pathLength)
    .transition(transitionPath)
    .attr("stroke-dashoffset", 0);
}

function updateChart(data) {
    const { yScale, xScale } = updateScales(data);
    const line = createLine(xScale, yScale);
    updateAxes(data, chart, xScale, yScale);
    updatePath(data, line);
}

updateChart(data);
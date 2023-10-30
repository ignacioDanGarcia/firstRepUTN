// Datos de ejemplo para el gráfico de red
const data = {
    nodes: [
      { id: 'A', name: 'Nodo A' },
      { id: 'B', name: 'Nodo B' },
      { id: 'C', name: 'Nodo C' },
    ],
    links: [
      { source: 'A', target: 'B' },
      { source: 'B', target: 'C' },
    ],
  };
  

  const width = 800;
  const height = 400;
  
  const svg = d3.select("#network-graph")
    .append("svg")
    .attr("width", width)
    .attr("height", height);
  
  const simulation = d3.forceSimulation(data.nodes)
    .force("link", d3.forceLink(data.links).id(d => d.id))
    .force("charge", d3.forceManyBody().strength(-100))
    .force("center", d3.forceCenter(width / 2, height / 2));
  
  const link = svg.selectAll("line")
    .data(data.links)
    .enter()
    .append("line")
    .attr("stroke", "#999")
    .attr("stroke-opacity", 0.6);
  
  const node = svg.selectAll("circle")
    .data(data.nodes)
    .enter()
    .append("circle")
    .attr("r", 10)
    .attr("fill", "blue");
  

  simulation.on("tick", () => {
    link
      .attr("x1", d => d.source.x)
      .attr("y1", d => d.source.y)
      .attr("x2", d => d.target.x)
      .attr("y2", d => d.target.y);
  
    node
      .attr("cx", d => d.x)
      .attr("cy", d => d.y);
  });
  
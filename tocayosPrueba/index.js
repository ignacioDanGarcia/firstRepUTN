const octokit = new Octokit({ auth: 'f9af2f88370826bb962d12033abd02a59e70f23f' });
const owner = 'ignacioDanGarcia';
const repo = 'firstRepUTN';

octokit.repos.getCommit({
    owner,
    repo,
    ref: 'HEAD' // Obtén el último commit en la rama principal
  }).then(response => {
    const lastCommit = response.data;
    const previousCommitSha = lastCommit.parents[0].sha;
  
    // Obten el diff entre el último commit y el commit anterior
    octokit.repos.compareCommits({
      owner,
      repo,
      base: previousCommitSha,
      head: lastCommit.sha
    }).then(diffResponse => {
      const diff = diffResponse.data;
      // 'diff' contiene los cambios entre el último commit y el anterior
    });
  });
  
const diffHTML = '<table>' + /* Genera una tabla HTML con los cambios */ + '</table>';
document.getElementById('cambios').innerHTML = diffHTML;

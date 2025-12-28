<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	
		<link rel="stylesheet" type="text/css" href="styles/global.css">
	    <link rel="stylesheet" type="text/css" href="styles/listaTutores.css">
	</head>
	<body>
	
	<div class="content">
		<div class="container">
		    <div class="game-results" id="gameResults">
		        <?php foreach ($games as $game): ?>
		        <div class="result-card" onclick="window.location.href = 'gamePage.php?id=<?= $game['id_jogo'] ?>'">
		            <div class="card-content">
		                <img src="<?= $game['imagem'] ?? "images/game-placeholder.jpg" ?>" class="card-image"/>
		
		                <div class="card-body">
		                    <div class="game-name"><?= $game['nome'] ?></div>
		
		                    <div class="game-info">
		                        <div class="game-details">
		                            <div class="game-detail-row">
		                                <img src="icons/players_dark.png" width="30px" height="30px">
		                                <div style="margin-left: 16px;"><?= $game['numero_jogadores_minimo'] ?>-<?= $game['numero_jogadores_maximo'] ?></div>
		                            </div>
		
		                            <div class="game-detail-row">
		                                <img src="icons/time_dark.png" width="30px" height="30px">
		                                <div style="margin-left: 16px;"><?= $game['tempo_medio'] ?></div>
		                            </div>
		
		                            <div class="game-detail-row">
		                                <img src="icons/primary_category_dark.png" width="30px" height="30px">
		                                <div style="margin-left: 16px;"><?= $game['categories'] ?></div>
		                            </div>
		                        </div>
		
		                        <div class="game-score">
		                            <div class="game-score-average">
		                                <?= number_format($game['reviewScore'], 1) ?>
		                            </div>
		
		                            <div class="game-score-stars">
		                                <?php
		                                $rounded = round($game['reviewScore']);
                                            for ($i = 0; $i < 5; $i++):
                                                $star = $i < $rounded ? 'star.png' : 'star_shadow_dark.png';
                                            ?>
		                                    <img src="icons/<?= $star ?>" width="30px" height="30px">
		                                <?php endfor; ?>
		                            </div>
		
		                            <div class="game-score-review-count">
		                                <?= $game['reviewCount'] ?> reviews
		                            </div>
		                        </div>
		                    </div>
		                </div>
		            </div>
		        </div>
		        <?php endforeach; ?>
		        </div>
		    </div>
		</div>
	</body>
</html>
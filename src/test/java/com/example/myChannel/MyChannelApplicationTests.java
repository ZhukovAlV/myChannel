package com.example.myChannel;

import com.example.myChannel.model.Recording;
import com.example.myChannel.model.TypeTrack;
import com.example.myChannel.service.PromotionService;
import com.example.myChannel.service.RecordingDataHub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.ZonedDateTime;

@SpringBootTest
class MyChannelApplicationTests {

	@Test
	void saveRecordVideo() throws MalformedURLException {
		final String STR_ENYA = "https://r2---sn-8ph2xajvh-vhnl.googlevideo.com/videoplayback?expire=1604192965&ei=ZbadX4unBtGCyAXG7LDYCw&ip=2.93.200.224&id=o-ADhGQ8P76yVMweJDepAjMJTk7JiPLwwX5OpIRyHENhp1&itag=397&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&mh=Bm&mm=31%2C29&mn=sn-8ph2xajvh-vhnl%2Csn-bvvbax-v8cl&ms=au%2Crdu&mv=m&mvi=2&pl=24&nh=%2CEAU&initcwndbps=1272500&vprv=1&mime=video%2Fmp4&gir=yes&clen=171701194&dur=3700.000&lmt=1603581451915817&mt=1604171323&fvip=8&keepalive=yes&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cdur%2Clmt&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cnh%2Cinitcwndbps&lsig=AG3C_xAwRQIhAOsRBF_mKmehgtpR2jrTMKA_CtocE6RVhIfKmKsQK2CuAiBHNa8pLYS3qPKkU7TeflFUOJXM0ngX7tWgHzgamShcjQ%3D%3D&alr=yes&sig=AOq0QJ8wRAIgXWqLrQxk6qf6XQTY1Iyv4GFtS3HJJetOFPRlw6CYv74CIHlvO9Q0PAjVZrTB7v5rY4Ar0Uia3V_d6pAs-NlD2dLP&cpn=0FfpQTg9dD4tn8LS&cver=2.20201030.01.00&rn=1613&rbuf=89887";
		RecordingDataHub recordingDataHub = new RecordingDataHub();
		Recording recording = new Recording("ENYA", TypeTrack.VIDEO, "Only time", "best",
				2020, new URL("http://www.youtube.com/watch?v=7jfRG-fgvQ8"), "folk", 61, new URL(STR_ENYA));
		Assertions.assertEquals(recordingDataHub.save(recording),STR_ENYA);
	}

	@Test
	void saveRecordAudio() throws MalformedURLException {
		final String STR_ENYA = "https://zaycev.net/musicset/dl/e9b952b8726fe4a5d1dd4140f0614e97/1640467.json";
		RecordingDataHub recordingDataHub = new RecordingDataHub();
		Recording recording = new Recording("ENYA", TypeTrack.AUDIO, "Only time", "best",
				2020, new URL("https://zaycev.net/pages/16404/1640467.shtml"), "folk", 61, new URL(STR_ENYA));
		Assertions.assertEquals(recordingDataHub.save(recording),STR_ENYA);
	}

	@Test
	void createCampaign() throws MalformedURLException {
		final String STR_ENYA = "https://r2---sn-8ph2xajvh-vhnl.googlevideo.com/videoplayback?expire=1604192965&ei=ZbadX4unBtGCyAXG7LDYCw&ip=2.93.200.224&id=o-ADhGQ8P76yVMweJDepAjMJTk7JiPLwwX5OpIRyHENhp1&itag=397&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&mh=Bm&mm=31%2C29&mn=sn-8ph2xajvh-vhnl%2Csn-bvvbax-v8cl&ms=au%2Crdu&mv=m&mvi=2&pl=24&nh=%2CEAU&initcwndbps=1272500&vprv=1&mime=video%2Fmp4&gir=yes&clen=171701194&dur=3700.000&lmt=1603581451915817&mt=1604171323&fvip=8&keepalive=yes&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cdur%2Clmt&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cnh%2Cinitcwndbps&lsig=AG3C_xAwRQIhAOsRBF_mKmehgtpR2jrTMKA_CtocE6RVhIfKmKsQK2CuAiBHNa8pLYS3qPKkU7TeflFUOJXM0ngX7tWgHzgamShcjQ%3D%3D&alr=yes&sig=AOq0QJ8wRAIgXWqLrQxk6qf6XQTY1Iyv4GFtS3HJJetOFPRlw6CYv74CIHlvO9Q0PAjVZrTB7v5rY4Ar0Uia3V_d6pAs-NlD2dLP&cpn=0FfpQTg9dD4tn8LS&cver=2.20201030.01.00&rn=1613&rbuf=89887";
		Recording recording = new Recording("ENYA", TypeTrack.VIDEO, "Only time", "best",
				2020, new URL("http://www.youtube.com/watch?v=7jfRG-fgvQ8"), "folk", 61, new URL(STR_ENYA));
		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		PromotionService promotionService = new PromotionService();
		promotionService.createCampaign(recording,zonedDateTime);
	}

	@Test
	void publish() throws MalformedURLException {
		final String STR_ENYA = "https://r2---sn-8ph2xajvh-vhnl.googlevideo.com/videoplayback?expire=1604192965&ei=ZbadX4unBtGCyAXG7LDYCw&ip=2.93.200.224&id=o-ADhGQ8P76yVMweJDepAjMJTk7JiPLwwX5OpIRyHENhp1&itag=397&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&mh=Bm&mm=31%2C29&mn=sn-8ph2xajvh-vhnl%2Csn-bvvbax-v8cl&ms=au%2Crdu&mv=m&mvi=2&pl=24&nh=%2CEAU&initcwndbps=1272500&vprv=1&mime=video%2Fmp4&gir=yes&clen=171701194&dur=3700.000&lmt=1603581451915817&mt=1604171323&fvip=8&keepalive=yes&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cdur%2Clmt&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cnh%2Cinitcwndbps&lsig=AG3C_xAwRQIhAOsRBF_mKmehgtpR2jrTMKA_CtocE6RVhIfKmKsQK2CuAiBHNa8pLYS3qPKkU7TeflFUOJXM0ngX7tWgHzgamShcjQ%3D%3D&alr=yes&sig=AOq0QJ8wRAIgXWqLrQxk6qf6XQTY1Iyv4GFtS3HJJetOFPRlw6CYv74CIHlvO9Q0PAjVZrTB7v5rY4Ar0Uia3V_d6pAs-NlD2dLP&cpn=0FfpQTg9dD4tn8LS&cver=2.20201030.01.00&rn=1613&rbuf=89887";
		Recording recording = new Recording("ENYA", TypeTrack.VIDEO, "Only time", "best",
				2020, new URL("http://www.youtube.com/watch?v=7jfRG-fgvQ8"), "folk", 61, new URL(STR_ENYA));
		ZonedDateTime zonedDateTime = ZonedDateTime.now();

		PromotionService promotionService = new PromotionService();
		promotionService.publish(recording,zonedDateTime);
	}

	@Test
	void publishAndCampaignOneWeek() throws MalformedURLException {
		final String STR_ENYA = "https://r2---sn-8ph2xajvh-vhnl.googlevideo.com/videoplayback?expire=1604192965&ei=ZbadX4unBtGCyAXG7LDYCw&ip=2.93.200.224&id=o-ADhGQ8P76yVMweJDepAjMJTk7JiPLwwX5OpIRyHENhp1&itag=397&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&mh=Bm&mm=31%2C29&mn=sn-8ph2xajvh-vhnl%2Csn-bvvbax-v8cl&ms=au%2Crdu&mv=m&mvi=2&pl=24&nh=%2CEAU&initcwndbps=1272500&vprv=1&mime=video%2Fmp4&gir=yes&clen=171701194&dur=3700.000&lmt=1603581451915817&mt=1604171323&fvip=8&keepalive=yes&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cdur%2Clmt&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cnh%2Cinitcwndbps&lsig=AG3C_xAwRQIhAOsRBF_mKmehgtpR2jrTMKA_CtocE6RVhIfKmKsQK2CuAiBHNa8pLYS3qPKkU7TeflFUOJXM0ngX7tWgHzgamShcjQ%3D%3D&alr=yes&sig=AOq0QJ8wRAIgXWqLrQxk6qf6XQTY1Iyv4GFtS3HJJetOFPRlw6CYv74CIHlvO9Q0PAjVZrTB7v5rY4Ar0Uia3V_d6pAs-NlD2dLP&cpn=0FfpQTg9dD4tn8LS&cver=2.20201030.01.00&rn=1613&rbuf=89887";
		Recording recording = new Recording("ENYA", TypeTrack.VIDEO, "Only time", "best",
				2020, new URL("http://www.youtube.com/watch?v=7jfRG-fgvQ8"), "folk", 61, new URL(STR_ENYA));
		ZonedDateTime zonedDateTime = ZonedDateTime.now().plusWeeks(1);

		PromotionService promotionService = new PromotionService();
		promotionService.publish(recording,zonedDateTime);
		promotionService.createCampaign(recording,zonedDateTime);
	}

	@Test
	void publishAndCampaignTwoWeek() throws MalformedURLException {
		final String STR_ENYA = "https://r2---sn-8ph2xajvh-vhnl.googlevideo.com/videoplayback?expire=1604192965&ei=ZbadX4unBtGCyAXG7LDYCw&ip=2.93.200.224&id=o-ADhGQ8P76yVMweJDepAjMJTk7JiPLwwX5OpIRyHENhp1&itag=397&aitags=133%2C134%2C135%2C136%2C137%2C160%2C242%2C243%2C244%2C247%2C248%2C278%2C394%2C395%2C396%2C397%2C398%2C399&source=youtube&requiressl=yes&mh=Bm&mm=31%2C29&mn=sn-8ph2xajvh-vhnl%2Csn-bvvbax-v8cl&ms=au%2Crdu&mv=m&mvi=2&pl=24&nh=%2CEAU&initcwndbps=1272500&vprv=1&mime=video%2Fmp4&gir=yes&clen=171701194&dur=3700.000&lmt=1603581451915817&mt=1604171323&fvip=8&keepalive=yes&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cgir%2Cclen%2Cdur%2Clmt&lsparams=mh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl%2Cnh%2Cinitcwndbps&lsig=AG3C_xAwRQIhAOsRBF_mKmehgtpR2jrTMKA_CtocE6RVhIfKmKsQK2CuAiBHNa8pLYS3qPKkU7TeflFUOJXM0ngX7tWgHzgamShcjQ%3D%3D&alr=yes&sig=AOq0QJ8wRAIgXWqLrQxk6qf6XQTY1Iyv4GFtS3HJJetOFPRlw6CYv74CIHlvO9Q0PAjVZrTB7v5rY4Ar0Uia3V_d6pAs-NlD2dLP&cpn=0FfpQTg9dD4tn8LS&cver=2.20201030.01.00&rn=1613&rbuf=89887";
		Recording recording = new Recording("ENYA", TypeTrack.VIDEO, "Only time", "best",
				2020, new URL("http://www.youtube.com/watch?v=7jfRG-fgvQ8"), "folk", 61, new URL(STR_ENYA));
		ZonedDateTime zonedDateTime = ZonedDateTime.now().plusWeeks(2);

		PromotionService promotionService = new PromotionService();
		promotionService.publish(recording,zonedDateTime);
		promotionService.createCampaign(recording,zonedDateTime);
	}
}

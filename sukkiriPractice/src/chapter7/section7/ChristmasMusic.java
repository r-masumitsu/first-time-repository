package chapter7.section7;

import java.io.File;
import java.util.Scanner;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//クリスマスのBGMとベルの音声を再生するプログラム
public class ChristmasMusic {

	public static void main(String[] args) throws Exception{
		//MIDIでBGMを再生するシンセサイザー（シーケンサ）の準備
		Sequencer seq = MidiSystem.getSequencer();
		seq.open();
		seq.setSequence(MidiSystem.getSequence(new File("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/jinglebells.mid")));
		seq.setLoopCount(-1);	//ループ再生を行わない指示
		seq.start();	//演奏開始
		
		//ベルの音をWAVから読み取る準備
		AudioInputStream ais = AudioSystem.getAudioInputStream(new File("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/bell.wav"));
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		
		System.out.println("メリークリスマス");
		System.out.println("何か入力すると3回だけベルが鳴るよ");
		
		for(int i = 0; i < 4; i++) {
			new Scanner(System.in).nextLine();	//任意の入力を待つ
			clip.start();
			clip.setFramePosition(0);
		}
		
		//サンプリング音声の終了
		clip.stop();
		ais.close();
		//MIDIシンセサイザの終了
		seq.stop();
		seq.close();
	}
}

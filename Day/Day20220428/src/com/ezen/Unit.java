package com.ezen;
public class Unit {
	public static void main(String[] args) {
		
	}
}

class Unit2{
	int x,y;

	void move(int x, int y) {/* ������ ��ġ�� �̵� */ }

	void stop() {/* ���� ��ġ�� ���� */}
	
}

class Marline extends Unit2 {
	void stimPack() {/* �������� ����Ѵ�. */}
}

class Tank extends Unit2 {
	void changeMode() {/* ���ݸ�带 ��ȯ�Ѵ�. */}
}

class Dropship extends Unit2 {
	void load() {/* ���õ� ����� �¿��. */}

	void unload() {/* ���õ� ����� ������. */}
}


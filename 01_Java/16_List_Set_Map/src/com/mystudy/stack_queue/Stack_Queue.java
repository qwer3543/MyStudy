package com.mystudy.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Queue (인터페이스): 형태상 파이프 형태(선입 선출)
// Stack (클래스): 형태상 바닥이 막힌 통의 형태(후입 선출)

public class Stack_Queue {

	public static void main(String[] args) {
		System.out.println("=== Queue (인터페이스) ===");
		
		// Queue (인터페이스) - LinkedList 클래스 큐 형태로 사용
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("1.첫째");
		queue.add("2.둘째");
		queue.offer("3.셋째");
		queue.offer("4.넷째");
		queue.offer("5.다섯째");
		
		System.out.println(queue);
		System.out.println("데이터 겟수" + queue.size());
		
		System.out.println("=== peek() ===");
		// peek() : 현재 사용할 수 있는 데이터를 확인만, 꺼내지는 않음
		
		String data = queue.peek();
		
		System.out.println(data);
		System.out.println(queue.peek());
		System.out.println("데이터 겟수" + queue.size());
		
		System.out.println("=== poll() ===");
		// poll() : 데이터를 꺼내온다, 데이터가 없다면 Null값 출력
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		// System.out.println(queue.remove()); 데이터가 없으면 오류 발생 시키기 가능
		
		System.out.println("데이터 겟수" + queue.size());
		System.out.println(queue); // 빈칸
		System.out.println(queue.isEmpty()); // true
		
		System.out.println("=== 전체 데이터 조회 ===");
		
		queue.offer("1.첫째");
		queue.add("2.둘째");
		queue.offer("3.셋째");
		queue.offer("4.넷째");
		queue.offer("5.다섯째");
		
		
		while (!queue.isEmpty()) {
			
			System.out.println(queue.poll());
			System.out.println("데이터 겟수" + queue.size());
		}
		
		System.out.println("=== Stack (클래스) ===");
		// Stack (클래스): 형태상 바닥이 막힌 통의 형태(후입 선출)
		
		Stack<String> stack = new Stack<String>();
		stack.push("1.첫째"); // Stack 메소드 기능(push())
		stack.push("2.둘째");
		stack.add("3.셋째"); // Vector 메소드 기능(add())
		stack.add("4.넷째");
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println("=== peek() ===");
		// peek() : 현재 사용할 수 있는 데이터를 확인만, 꺼내지는 않음
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		System.out.println("=== pop() ===");
		// pop() : 데이터를 꺼내온다, 데이터가 없다면 오류가 발생한다
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack);
		
		System.out.println("=== 전체 데이터 조회 ===");
		
		System.out.println(stack.empty()); // 비어 있냐? true
		
		stack.push("1.첫째"); // Stack 메소드 기능(push())
		stack.push("2.둘째");
		stack.add("3.셋째"); // Vector 메소드 기능(add())
		stack.add("4.넷째");
		
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.size());
		
		
		
		
		
		
	}

}

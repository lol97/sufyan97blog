package sufyan97_blog.mutimutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnMutImutable {
	public static void main(String[] args) {
		LearnMutImutable mutImutable = new LearnMutImutable();
		mutImutable.doMutableStringBuilder();
		mutImutable.doImmutableString();
		mutImutable.printAddressStringBuilder();
		mutImutable.printAddressString();
		mutImutable.doAddImmutableCollection();
	}

	public void doMutableStringBuilder() {
		StringBuilder sb = new StringBuilder("Halo");
		sb.append(", Dunia!"); // Memodifikasi isi StringBuilder tanpa membuat objek baru
		System.out.println(sb); // Output: Halo, Dunia!
	}

	public void doImmutableString() {
		String str = "Halo";
		str = str.concat(", Dunia!"); // Menciptakan objek baru
		System.out.println(str); // Output: Halo, Dunia!
	}

	public void printAddressStringBuilder() {
		StringBuilder sb = new StringBuilder("Halo");
		System.out.println(System.identityHashCode(sb)); // Cetak alamat memori

		sb.append(", Dunia!"); // Modifikasi objek
		System.out.println(System.identityHashCode(sb)); // Cetak alamat memori lagi
	}

	public void printAddressString() {
		String str = "Halo";
		System.out.println(System.identityHashCode(str)); // Cetak alamat memori

		str = str.concat(", Dunia!"); // Modifikasi objek, ex : 41903949
		System.out.println(System.identityHashCode(str)); // Cetak alamat memori lagi, ex : 488970385
	}

	public void doAddImmutableCollection(){
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
		List<String> immutableList = Collections.unmodifiableList(list);

		list.add("D"); // Berhasil
		immutableList.add("E"); // Error: UnsupportedOperationException
	}
}

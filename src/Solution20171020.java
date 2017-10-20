/*
1
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #

2
# # # # # # #
 # # # # # # #
# # # # # # #
 # # # # # # #
# # # # # # #
 # # # # # # #
# # # # # # #

3
#                    # # # # # # # #      # # # # # # # #                    #
# #                  # # # # # # #          # # # # # # #                  # #
# # #                # # # # # #              # # # # # #                # # #
# # # #              # # # # #                  # # # # #              # # # #
# # # # #            # # # #                      # # # #            # # # # #
# # # # # #          # # #                          # # #          # # # # # #
# # # # # # #        # #                              # #        # # # # # # #
# # # # # # # #      #                                  #      # # # # # # # #
     (a)                   (b)                  (c)                  (d)
 */
public class Solution20171020 {

	public static void main(String[] args) {
		// 1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
		
		System.out.println("_______________");
		// 2
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 10; j++) {
				if ((j + i) % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
		System.out.println("_______________");
		// 3 (a)
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < (i*2 + 1); j ++) {
				if (j % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		
		System.out.println("_______________");
		// 3 (b)
		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j < (i*2 + 1); j ++) {
				if (j % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		

		System.out.println("_______________");
		// 3 (c)
		for (int i = 7; i >= 0; i--) {
			for (int k = 0; k < (7 - i); k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < (i*2 + 1); j ++) {
				if (j % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		

		System.out.println("_______________");
		// 3 (d)
		for (int i = 0; i < 8; i++) {
			for (int k = 0; k < (7 - i) * 2; k++) {
				System.out.print(' ');
			}
			for (int j = 0; j < (i*2 + 1); j ++) {
				if (j % 2 == 0) {
					System.out.print('#');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
